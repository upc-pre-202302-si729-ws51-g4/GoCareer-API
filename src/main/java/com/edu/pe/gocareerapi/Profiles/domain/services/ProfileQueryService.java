package com.edu.pe.gocareerapi.Profiles.domain.services;

import com.edu.pe.gocareerapi.Profiles.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetAllProfilesQuery;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetProfileByEmailQuery;
import com.edu.pe.gocareerapi.Profiles.domain.model.queries.GetProfileByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProfileQueryService {

    Optional<Profile> handle(GetProfileByEmailQuery query);

    Optional<Profile> handle(GetProfileByIdQuery query);

    List<Profile> handle(GetAllProfilesQuery query);
}
