package com.edu.pe.gocareerapi.Meetings.domain.model.commands;

public record CreateStudentCommand(String firstName, String lastName, String email, String description, Boolean isSpecialist) {
}
