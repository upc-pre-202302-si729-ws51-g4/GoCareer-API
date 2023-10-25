package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;


import com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates.Test;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.EnrollmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Enrollment extends AbstractAggregateRoot<Enrollment> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @Getter
    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;

    private EnrollmentStatus status;



    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    public Enrollment(){}

    public Enrollment(Test test){

    }





}
