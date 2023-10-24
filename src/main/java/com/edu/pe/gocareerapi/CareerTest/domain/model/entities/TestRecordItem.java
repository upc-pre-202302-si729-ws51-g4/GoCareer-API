package com.edu.pe.gocareerapi.CareerTest.domain.model.entities;

import com.edu.pe.gocareerapi.CareerTest.domain.model.valueObjects.TestStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class TestRecordItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TestStatus status;

    private Date startedAt;

    private Date completedAt;

    public TestRecordItem(){}


}
