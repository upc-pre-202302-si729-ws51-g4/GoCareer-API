package com.edu.pe.gocareerapi.CareerTest.domain.model.valueObjects;


import com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates.Test;
import com.edu.pe.gocareerapi.CareerTest.domain.model.entities.Question;
import com.edu.pe.gocareerapi.CareerTest.domain.model.entities.TestPathItem;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Embeddable
public class TestPath {


    @OneToMany(mappedBy = "test")
    private List<TestPathItem> testPathItems;

    public TestPath(){
        this.testPathItems = new ArrayList<>();
    }


    public void addItem(Test test, Question question, TestPathItem nextItem){
        TestPathItem testPathItem = new TestPathItem(test,question,nextItem);
        this.testPathItems.add(testPathItem);
    }


    /*
    public void addItem(Test test, Question question){
        int size = testPathItems.size();
        Long lastItem = size > 0 ? testPathItems.get(size-1).getId(): null;
        TestPathItem testPathItem = new TestPathItem(test,question,lastItem);
        this.testPathItem.add(testPathItem);
    }

     */



}
