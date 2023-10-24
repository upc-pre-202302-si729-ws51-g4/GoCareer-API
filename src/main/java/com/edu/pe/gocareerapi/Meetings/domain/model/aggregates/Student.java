package com.edu.pe.gocareerapi.Meetings.domain.model.aggregates;

import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.ProfileId;
import com.edu.pe.gocareerapi.Meetings.domain.model.valueObjects.StudentId;
import com.edu.pe.gocareerapi.Profile.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.shared.model.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Student extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Embedded
    @Column(name = "student_id")
    private StudentId studentId;

    @Embedded
    private ProfileId profileId;

    public Student(){
        this.studentId = new StudentId();
    }

    public Student(Long profileId){
        this();
        this.profileId = new ProfileId(profileId);
        this.studentId = new StudentId();
    }

}
