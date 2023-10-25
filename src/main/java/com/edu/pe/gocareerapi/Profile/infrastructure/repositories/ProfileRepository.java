package com.edu.pe.gocareerapi.Profile.infrastructure.repositories;

import com.edu.pe.gocareerapi.Profile.domain.model.aggregates.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProfileRepository extends JpaRepository {

    Optional<Profile> findProfileById();
}
