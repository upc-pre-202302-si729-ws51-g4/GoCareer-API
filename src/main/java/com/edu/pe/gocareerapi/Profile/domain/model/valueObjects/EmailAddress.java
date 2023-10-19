package com.edu.pe.gocareerapi.Profile.domain.model.valueObjects;

import jakarta.validation.constraints.Email;

public record EmailAddress(@Email String address) {
    public EmailAddress(){
        this(null);
    }
}
