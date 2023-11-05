package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Specialist;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetSpecialistByProfileIdQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetSpecialistByRecordId;

import java.util.Optional;

public interface SpecialistQueryService {

    Optional<Specialist> handle(GetSpecialistByProfileIdQuery query);

    Optional<Specialist> handle(GetSpecialistByRecordId query);
}
