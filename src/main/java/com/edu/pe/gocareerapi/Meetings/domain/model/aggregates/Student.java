package com.edu.pe.gocareerapi.Meetings.domain.model.entities;

import com.edu.pe.gocareerapi.Profile.domain.model.aggregates.Profile;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    private String career;

    


}
