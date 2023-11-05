package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public record SpecialistCareer(String career) {
    public SpecialistCareer(){
        this(null);
    }

    public SpecialistCareer{
        if(career == null || career.isBlank()){
            throw new IllegalArgumentException("Career can't be blank");
        }
    }
}
