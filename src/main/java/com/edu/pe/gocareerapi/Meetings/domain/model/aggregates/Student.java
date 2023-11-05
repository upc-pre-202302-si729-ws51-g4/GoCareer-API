package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;

import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.ProfileId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentRecordId;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Student extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Embedded
    @Column(name = "student_id")
    private StudentRecordId studentRecordId;

    @Embedded
    private ProfileId profileId;

    public Student(){
        this.studentRecordId = new StudentRecordId();
    }

    public Student(Long profileId){
        this();
        this.profileId = new ProfileId(profileId);
    }

    public String getStudentRecordId(){ return this.studentRecordId.studentRecordId();}

    public Long getProfileId(){ return this.profileId.id(); }

}
