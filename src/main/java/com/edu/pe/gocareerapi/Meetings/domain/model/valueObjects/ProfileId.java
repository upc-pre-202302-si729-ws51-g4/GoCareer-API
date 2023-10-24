package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record ProfileId(Long studentId) {

    public ProfileId(){
        this(0L);
    }

    public ProfileId {
        if (studentId < 0){
            throw new IllegalArgumentException("Student ID cannot be negative");
        }
    }
}
