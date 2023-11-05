package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.commands.CreateSpecialistCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;

public interface SpecialistCommandService {


    SpecialistRecordId handle(CreateSpecialistCommand command);
}
