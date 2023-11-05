package com.edu.pe.gocareerapi.Meetings.infrastructure.repositories;

import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Student;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.ProfileId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByRecordId(StudentRecordId studentRecordId);

    Optional<Student> findStudentByProfileId(ProfileId profileId);
}
