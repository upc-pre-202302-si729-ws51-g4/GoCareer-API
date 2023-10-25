package com.edu.pe.gocareerapi.Profile.domain.services;

import com.edu.pe.gocareerapi.Profile.domain.model.commands.CreateProfileCommand;

public interface ProfileCommandService {

    Long handle(CreateProfileCommand command);
}
