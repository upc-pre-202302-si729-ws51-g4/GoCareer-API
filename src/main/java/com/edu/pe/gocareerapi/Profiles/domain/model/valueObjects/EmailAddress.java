package com.edu.pe.gocareerapi.Profiles.domain.model.valueObjects;

import jakarta.validation.constraints.Email;

public record EmailAddress(@Email String address) {
    public EmailAddress(){
        this(null);
    }
}
