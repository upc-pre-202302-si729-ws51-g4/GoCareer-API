package com.edu.pe.gocareerapi.CareerTest.infrastructure.repositories;

import com.edu.pe.gocareerapi.CareerTest.domain.model.aggregates.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {
}
