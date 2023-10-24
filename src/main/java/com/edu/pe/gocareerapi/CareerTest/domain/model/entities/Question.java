package com.edu.pe.gocareerapi.CareerTest.domain.model.entities;

import com.edu.pe.gocareerapi.CareerTest.domain.model.valueObjects.QuestionAlternative;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Question extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    private String content;

    @Embedded
    private QuestionAlternative questionAlternative;


}
