package com.edu.pe.gocareerapi.CareerTest.domain.model.entities;


import com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates.Test;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class TestPathItem extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @ManyToOne(optional = false)
    private Test test;


    @Getter
    @ManyToOne(optional = false)
    private Question question;

    @Getter
    @ManyToOne
    private TestPathItem nextQuestionId;


    public TestPathItem(Test test, Question question, TestPathItem nextItem){
        this.test = test;
        this.question = question;
        this.nextQuestionId = nextItem;
    }

    public TestPathItem(){
        this.question = null;
        this.nextQuestionId = null;
    }

    public void updateNextItem(TestPathItem nextQuestionId){
        this.nextQuestionId = nextQuestionId;
    }


}
