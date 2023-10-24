package com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates;


import com.edu.pe.gocareerapi.CareerTest.domain.model.valueObjects.TestPath;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Test extends AuditableModel {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Embedded
    @Getter
    private TestPath testPath;

    private Float grade;

    private String resume;

}
