package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Enrollment;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetEnrollmentByIdQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetSpecialistEnrollmentsQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetStudentEnrollmentsQuery;

import java.util.List;
import java.util.Optional;

public interface EnrollmentQueryService {

    List<Enrollment> handle(GetStudentEnrollmentsQuery query);
    List<Enrollment> handle(GetSpecialistEnrollmentsQuery query);

    Optional<Enrollment> handle(GetEnrollmentByIdQuery query);
}
