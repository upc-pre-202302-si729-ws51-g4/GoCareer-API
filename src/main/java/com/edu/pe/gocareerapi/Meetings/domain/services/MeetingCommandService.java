package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Meeting;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.CreateMeetingCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.DeleteMeetingCommand;
import com.edu.pe.gocareerapi.Meetings.domain.model.commands.UpdateMeetingCommand;

import java.util.Optional;

public interface MeetingCommandService {

    Long handle(CreateMeetingCommand command);

    Optional<Meeting> handle(UpdateMeetingCommand command);


    void handle(DeleteMeetingCommand command);
}
