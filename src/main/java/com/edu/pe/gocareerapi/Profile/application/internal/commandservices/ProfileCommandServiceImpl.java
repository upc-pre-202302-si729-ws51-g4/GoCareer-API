package com.edu.pe.gocareerapi.Profile.application.internal.commandservices;


import com.edu.pe.gocareerapi.Profile.domain.model.commands.CreateProfileCommand;
import com.edu.pe.gocareerapi.Profile.domain.model.valueObjects.EmailAddress;
import com.edu.pe.gocareerapi.Profile.domain.services.ProfileCommandService;
import com.edu.pe.gocareerapi.Profile.infrastructure.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileCommandServiceImpl implements ProfileCommandService {

    private final ProfileRepository profileRepository;

    public ProfileCommandServiceImpl(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }


    @Override
    public Long handle(CreateProfileCommand command){}
}
