package com.edu.pe.gocareerapi.Profiles.interfaces.rest.resources;

public record CreateProfileResource(String firstName, String lastName, String email, String description, Boolean isSpecialist) {
}
