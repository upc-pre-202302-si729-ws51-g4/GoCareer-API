package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;


import com.edu.pe.gocareerapi.Meetings.domain.model.entities.Reunion;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.MeetingPath;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Getter
public class Meeting extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @CreatedDate
    private Date createdAt;


    @Embedded
    private MeetingPath meetingPath;

    public Meeting(){
        this.title = Strings.EMPTY;
        this.description = Strings.EMPTY;
        this.meetingPath = new MeetingPath();
    }


    public Meeting(String title, String description){
        this();
        this.title = title;
        this.description = description;
    }


    public void addMeetingToPath(Reunion reunion){ this.meetingPath.addItem(this,reunion);}


    public void addMeetingToPath(Reunion reunion, Long nextReunion){
        this.meetingPath.addItem(this,reunion,nextReunion);
    }


}
