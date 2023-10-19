package com.edu.pe.gocareerapi.Profile.domain.model.aggregates;


import com.edu.pe.gocareerapi.Profile.domain.model.valueObjects.EmailAddress;
import com.edu.pe.gocareerapi.Profile.domain.model.valueObjects.IsSpecialist;
import com.edu.pe.gocareerapi.Profile.domain.model.valueObjects.PersonDescription;
import com.edu.pe.gocareerapi.Profile.domain.model.valueObjects.PersonName;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.Date;

@Entity
public class Profile extends AbstractAggregateRoot<Profile> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Embedded
    private PersonName name;

    @Embedded
    private EmailAddress email;

    @Embedded
    private IsSpecialist specialist;

    @Embedded
    private PersonDescription description;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;


    public Profile(String fistName, String lastName, String email, Boolean specialist){
        this.name = new PersonName(fistName,lastName);
        this.email = new EmailAddress(email);
        this.specialist = new IsSpecialist(specialist);
    }

    public Profile(){}

    public void updateName(String firstName, String lastName){
        this.name = new PersonName(firstName,lastName);
    }

    public void updateEmail(String email){
        this.email = new EmailAddress(email);
    }

    public void updateRole(Boolean role){
        this.specialist = new IsSpecialist(role);
    }

    public String getFullName(){
        return name.getPersonName();
    }

    public String getDescription(){
        return description.getPersonDescription();
    }

    public Boolean getRole(){
        return specialist.isSpecialist();
    }

}
