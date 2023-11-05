package com.edu.pe.gocareerapi.Meetings.infrastructure.repositories;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Specialist;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.ProfileId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
    Optional<Specialist> findSpecialistByRecordId(SpecialistRecordId specialistRecordId);

    Optional<Specialist> findSpecialistByProfileId(ProfileId profileId);


}
