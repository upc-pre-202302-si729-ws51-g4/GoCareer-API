package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.commands.CancelEnrollmentCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.ConfirmEnrollmentCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.RejectEnrollmentCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.RequestEnrollmentCommand;

public interface EnrollmentCommandService {

    Long handle(RequestEnrollmentCommand command);

    Long handle(ConfirmEnrollmentCommand command);


    Long handle(CancelEnrollmentCommand command);

    Long handle(RejectEnrollmentCommand command);


}
