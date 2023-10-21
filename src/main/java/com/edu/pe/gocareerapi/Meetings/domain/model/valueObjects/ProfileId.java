package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record ProfileId(Integer studentId) {

    public ProfileId(){
        this(null);
    }

    public ProfileId {
        if (studentId < 0){
            throw new IllegalArgumentException("Student ID cannot be negative");
        }
    }
}
