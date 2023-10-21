package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;

import jakarta.persistence.Embeddable;


@Embeddable
public record StudentId(Integer studentId) {

    public StudentId(){
        this(null);
    }

    public StudentId{
        if (studentId < 0){
            throw new IllegalArgumentException("Student ID cannot be negative");
        }
    }
}
