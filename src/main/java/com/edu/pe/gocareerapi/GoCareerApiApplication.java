package com.edu.pe.gocareerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class GoCareerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoCareerApiApplication.class, args);
    }

}
