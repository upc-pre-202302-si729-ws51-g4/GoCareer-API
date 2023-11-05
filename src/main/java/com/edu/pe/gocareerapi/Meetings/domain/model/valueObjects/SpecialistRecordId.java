package com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects;


import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public record SpecialistRecordId(String specialistRecordId) {
    public SpecialistRecordId() {
        this(UUID.randomUUID().toString());
    }

    public SpecialistRecordId {
        if(specialistRecordId == null || specialistRecordId.isBlank()) {
            throw new IllegalArgumentException("Specialist record id cannot be blank");
        }
    }
}
