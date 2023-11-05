package com.edu.pe.gocareerapi.Profiles.application.internal.queryservices;

import com.edu.pe.gocareerapi.Profiles.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetAllProfilesQuery;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetProfileByEmailQuery;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetProfileByIdQuery;
import com.edu.pe.gocareerapi.Profiles.domain.services.ProfileQueryService;
import com.edu.pe.gocareerapi.Profiles.infrastructure.persistence.jpa.repositories.ProfileRepository;

import java.util.List;
import java.util.Optional;

public class ProfileQueryServiceImpl implements ProfileQueryService {

    private final ProfileRepository profileRepository;

    public ProfileQueryServiceImpl(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    @Override
    public Optional<Profile> handle(GetProfileByEmailQuery query){
        return profileRepository.findByEmail(query.emailAddress());
    }

    @Override
    public Optional<Profile> handle(GetProfileByIdQuery query) {
        return profileRepository.findById(query.profileId());
    }

    @Override
    public List<Profile> handle(GetAllProfilesQuery query){
        return profileRepository.findAll();
    }


}
