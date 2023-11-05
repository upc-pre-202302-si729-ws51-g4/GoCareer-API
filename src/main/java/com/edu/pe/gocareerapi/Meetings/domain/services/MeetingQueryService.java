package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Meeting;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetAllMeetingsQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetMeetingByIdQuery;

import java.util.List;
import java.util.Optional;

public interface MeetingQueryService {

    Optional<Meeting> handle(GetMeetingByIdQuery query);

    List<Meeting> handle(GetAllMeetingsQuery query);
}
