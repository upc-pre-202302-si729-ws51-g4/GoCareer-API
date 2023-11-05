package com.edu.pe.gocareerapi.Meetings.infrastructure.repositories;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Enrollment;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findAllByStudentRecordId(StudentRecordId studentRecordId);
    List<Enrollment> findAllBySpecialistRecordId(SpecialistRecordId specialistRecordId);
}
