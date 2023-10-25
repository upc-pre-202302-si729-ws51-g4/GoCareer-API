package com.edu.pe.gocareerapi.Meetings.domain.model.entities;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class MeetingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    /*
    @ManyToOne(optional = false)
    @JoinColumn(name = "meeting_id")
    private

     */

}
