package com.edu.pe.gocareerapi.Meetings.application.internal.queryservices;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Student;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetStudentByProfileIdQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetStudentByStudentRecordId;
import com.edu.pe.gocareerapi.Meetings.domain.services.StudentQueryService;
import com.edu.pe.gocareerapi.Meetings.infrastructure.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentQueryServiceImpl implements StudentQueryService {

    private final StudentRepository studentRepository;

    public StudentQueryServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> handle(GetStudentByStudentRecordId query){
        return studentRepository.findStudentByRecordId(query.studentRecordId());
    }

    @Override
    public Optional<Student> handle(GetStudentByProfileIdQuery query){
        return studentRepository.findStudentByProfileId(query.profileId());
    }
}
