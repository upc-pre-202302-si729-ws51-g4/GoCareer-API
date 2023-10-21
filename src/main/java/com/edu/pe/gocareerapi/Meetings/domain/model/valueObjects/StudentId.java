package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;


import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record StudentId(String studentRecordId) {

    public StudentId(){
        this(UUID.randomUUID().toString());
    }

    public StudentId{
        if(studentRecordId == null || studentRecordId.isBlank()){
            throw new IllegalArgumentException("Student record id cannot be null or blank");
        }
    }
}
