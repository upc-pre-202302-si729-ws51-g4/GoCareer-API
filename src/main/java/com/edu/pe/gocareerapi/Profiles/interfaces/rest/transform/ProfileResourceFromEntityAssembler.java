package com.edu.pe.gocareerapi.Profiles.interfaces.rest.transform;

import com.edu.pe.gocareerapi.Profiles.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.Profiles.interfaces.rest.resources.ProfileResource;

public class ProfileResourceFromEntityAssembler {
    public static ProfileResource toResourceFromEntity(Profile entity){
        return new ProfileResource(entity.getId(), entity.getFullName(), entity.getEmailAddress(), entity.getDescription(), entity.getRole());
    }
}
