package com.edu.pe.gocareerapi.User.domain.model.valueObjects;

public record UserName(String firstName, String lastName) {
    public UserName(){
        this(null,null);
    }

    public UserName{
        if(firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("First name cannot be blank");
        }

        if(lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be blank");
        }
    }

    public String getUserName(){
        return firstName + " " + lastName;
    }
}
