package com.edu.pe.gocareerapi.Meetings.application.internal.queryservices;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Specialist;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetSpecialistByProfileIdQuery;
import com.edu.pe.gocareerapi.Meetings.domain.model.queries.GetSpecialistByRecordId;
import com.edu.pe.gocareerapi.Meetings.domain.services.SpecialistQueryService;
import com.edu.pe.gocareerapi.Meetings.infrastructure.repositories.SpecialistRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialistQueryServiceImpl implements SpecialistQueryService {

    private final SpecialistRepository specialistRepository;

    public SpecialistQueryServiceImpl(SpecialistRepository specialistRepository){
        this.specialistRepository = specialistRepository;
    }


    @Override
    public Optional<Specialist> handle(GetSpecialistByProfileIdQuery query){
        return specialistRepository.findSpecialistByProfileId(query.profileId());
    }

    @Override
    public Optional<Specialist> handle(GetSpecialistByRecordId query){
        return specialistRepository.findSpecialistByRecordId(query.specialistRecordId());
    }
}
