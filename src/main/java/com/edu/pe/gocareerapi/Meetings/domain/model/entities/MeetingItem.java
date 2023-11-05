package com.edu.pe.gocareerapi.Meetings.domain.model.entities;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Meeting;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class MeetingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @ManyToOne(optional = false)
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @Getter
    @ManyToOne
    @JoinColumn(name = "next_meeting_id")
    private MeetingItem nextItem;

    @Getter
    @ManyToOne(optional = false)
    @JoinColumn(name = "reunion_id")
    private Reunion reunion;

    public MeetingItem(Meeting meeting, Reunion reunion, MeetingItem nextItem){
        this.meeting = meeting;
        this.reunion = reunion;
        this.nextItem = nextItem;
    }

    public MeetingItem(){
        this.meeting = null;
        this.nextItem = null;
    }


    public void updateNextItem(MeetingItem nextItem){
        this.nextItem = nextItem;
    }







}
