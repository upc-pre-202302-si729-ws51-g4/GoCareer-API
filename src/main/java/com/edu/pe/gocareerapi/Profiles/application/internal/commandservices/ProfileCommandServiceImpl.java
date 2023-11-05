package com.edu.pe.gocareerapi.Profiles.application.internal.commandservices;

import com.edu.pe.gocareerapi.Profiles.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.Profiles.domain.model.commands.CreateProfileCommand;
import com.edu.pe.gocareerapi.Profiles.domain.model.valueObjects.EmailAddress;
import com.edu.pe.gocareerapi.Profiles.domain.services.ProfileCommandService;
import com.edu.pe.gocareerapi.Profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;
import org.springframework.stereotype.Service;


@Service
public class ProfileCommandServiceImpl implements ProfileCommandService {

    private final ProfileRepository profileRepository;

    public ProfileCommandServiceImpl(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }


    @Override
    public Long handle(CreateProfileCommand command){
        var email = new EmailAddress(command.email());
        profileRepository.findByEmail(email).map(profile -> {
            throw new IllegalArgumentException("Profile with" + command.email() + "already exists");
        });
        var profile = new Profile(command.firstName(), command.lastName(), command.email(), command.isSpecialist());
        profileRepository.save(profile);
        return profile.getId();
    }


}
