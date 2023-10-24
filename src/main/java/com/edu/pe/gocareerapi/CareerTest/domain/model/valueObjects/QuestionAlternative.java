package com.edu.pe.gocareerapi.CareerTest.domain.model.valueObjects;


import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Embeddable
public class QuestionAlternative extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    private String content;

    private Float score;

    public QuestionAlternative(String content, Float score){
        this.content = content;
        this.score = score;
    }

    public QuestionAlternative(){
        this.content = null;
        this.score = null;
    }

    public void updateQuestionContent(String newContent){
        this.content = newContent;
    }



}
