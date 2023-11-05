package com.edu.pe.gocareerapi.Meetings.domain.services;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Student;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetStudentByProfileIdQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetStudentByStudentRecordId;

import java.util.List;
import java.util.Optional;

public interface StudentQueryService {

    Optional<Student> handle(GetStudentByProfileIdQuery query);

    Optional<Student> handle(GetStudentByStudentRecordId query);
}
