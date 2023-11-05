package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;


import com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates.Test;
import com.edu.pe.gocareerapi.Meetings.domain.model.entities.Reunion;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.EnrollmentStatus;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.SpecialistRecordId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Enrollment extends AbstractAggregateRoot<Enrollment>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @Getter
    @ManyToOne
    @JoinColumn(name = "reunion_id")
    private Reunion reunion;

    @Getter
    @Embedded
    private StudentRecordId studentRecordId;

    @Getter
    @Embedded
    private SpecialistRecordId specialistRecordId;


    private EnrollmentStatus status;


    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;


    public Enrollment(){}

    public Enrollment(StudentRecordId studentRecordId, SpecialistRecordId specialistRecordId, Reunion reunion){
        this.studentRecordId = studentRecordId;
        this.specialistRecordId = specialistRecordId;
        this.reunion = reunion;
        this.status = EnrollmentStatus.REQUESTED;
        // Progress Record
    }

    public void confirm(){
        this.status = EnrollmentStatus.CONFIRMED;
    }

    public void reject(){
        this.status = EnrollmentStatus.REJECTED;
    }

    public void cancel(){
        this.status = EnrollmentStatus.CANCELLED;
    }

    public String getStatus(){ return status.name().toLowerCase();}

    public boolean isConfirmed(){ return status == EnrollmentStatus.CONFIRMED;}

    public boolean isRejected(){ return status == EnrollmentStatus.REJECTED;}










    

}