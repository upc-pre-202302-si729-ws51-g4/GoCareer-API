package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.commands.CreateStudentCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;

public interface StudentCommandService {

    StudentRecordId handle(CreateStudentCommand command);
}
