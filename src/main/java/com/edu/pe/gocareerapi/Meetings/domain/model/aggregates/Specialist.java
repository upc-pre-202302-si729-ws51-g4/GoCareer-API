package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;

import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.ProfileId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Specialist extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Embedded
    @Column(name="career_specialist_id")
    private SpecialistRecordId specialistRecordId;

    @Embedded
    private ProfileId profileId;


    public Specialist(){
        this.specialistRecordId = new SpecialistRecordId();
    }

    public Specialist(ProfileId profileId){
        this();
        this.profileId = profileId;
    }

    public String getSpecialistRecordId(){ return this.specialistRecordId.specialistRecordId();}

    public Long getProfileId() {return this.profileId.id();}

}
