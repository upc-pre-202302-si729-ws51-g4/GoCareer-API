package com.edu.pe.gocareerapi.Profiles.domain.services;

import com.edu.pe.gocareerapi.Profiles.domain.model.commands.CreateProfileCommand;

public interface ProfileCommandService {

    Long handle(CreateProfileCommand command);
}
