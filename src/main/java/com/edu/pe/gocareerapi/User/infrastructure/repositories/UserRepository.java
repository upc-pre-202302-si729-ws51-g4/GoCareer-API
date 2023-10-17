package com.edu.pe.gocareerapi.User.infrastructure.repositories;

import com.edu.pe.gocareerapi.User.domain.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
