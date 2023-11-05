package com.edu.pe.gocareerapi.Profiles.domain.model.queries;

import com.edu.pe.gocareerapi.Profiles.domain.model.valueObjects.EmailAddress;

public record GetProfileByEmailQuery(EmailAddress emailAddress) {}
