package com.edu.pe.gocareerapi.Profiles.interfaces.rest.transform;

import com.edu.pe.gocareerapi.Profiles.domain.model.commands.CreateProfileCommand;
import com.edu.pe.gocareerapi.Profiles.interfaces.rest.resources.CreateProfileResource;

public class CreateProfileCommandFromResourceAssembler {

    public static CreateProfileCommand toCommandFromResource(CreateProfileResource resource){
        return new CreateProfileCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email(),
                resource.description(),
                resource.isSpecialist()
        );
    }
}
