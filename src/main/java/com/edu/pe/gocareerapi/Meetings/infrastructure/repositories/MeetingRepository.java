package com.edu.pe.gocareerapi.Meetings.infrastructure.repositories;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    Optional<Meeting> findById(Long id);
}
