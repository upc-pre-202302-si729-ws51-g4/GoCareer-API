package com.edu.pe.gocareerapi.Profiles.domain.model.commands;

public record CreateProfileCommand(String firstName, String lastName,String email, String description, Boolean isSpecialist ) {}
