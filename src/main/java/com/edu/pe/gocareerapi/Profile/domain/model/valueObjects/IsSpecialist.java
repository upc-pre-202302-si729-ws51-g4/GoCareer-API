package com.edu.pe.gocareerapi.Profile.domain.model.valueObjects;

public record IsSpecialist(Boolean isSpecialist) {
    public IsSpecialist(){
        this(null);
    }

    public IsSpecialist{
        if(isSpecialist == null){
            throw new IllegalArgumentException("You have to specify if you're specialist");
        }
    }
}
