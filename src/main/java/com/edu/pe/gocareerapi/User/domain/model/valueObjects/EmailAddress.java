package com.edu.pe.gocareerapi.User.domain.model.valueObjects;

import jakarta.validation.constraints.Email;

public record EmailAddress(@Email String address) {
    public EmailAddress(){
        this(null);
    }
}
