package com.edu.pe.gocareerapi.Meetings.infrastructure.repositories;

import com.edu.pe.gocareerapi.Meetings.domain.model.entities.MeetingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<MeetingItem,Long> {

}
