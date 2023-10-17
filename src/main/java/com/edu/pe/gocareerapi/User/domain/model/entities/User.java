package com.edu.pe.gocareerapi.User.domain.model.entities;


import com.edu.pe.gocareerapi.User.domain.shared.model.AuditableModel;
import jakarta.persistence.*;

@Entity
public class User extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private String username;
    @Embedded
    private String password;

    @Embedded
    private String description;





}
