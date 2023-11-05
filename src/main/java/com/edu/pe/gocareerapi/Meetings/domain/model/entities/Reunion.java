package com.edu.pe.gocareerapi.Meetings.domain.model.entities;


import com.edu.pe.gocareerapi.Meetings.domain.model.aggregates.Student;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Reunion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    private String description;

    @CreatedDate
    private Date date;


}
