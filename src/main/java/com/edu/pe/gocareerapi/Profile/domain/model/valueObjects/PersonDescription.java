package com.edu.pe.gocareerapi.Profile.domain.model.valueObjects;

public record PersonDescription(String description) {

    public PersonDescription(){
        this(null);
    }

    public String getPersonDescription(){
        return description;
    }
}
