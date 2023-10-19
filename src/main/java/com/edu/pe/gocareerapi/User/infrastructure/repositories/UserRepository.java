package com.edu.pe.gocareerapi.User.infrastructure.repositories;

import com.edu.pe.gocareerapi.User.domain.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}
