package com.edu.pe.gocareerapi.Profiles.infrastructure.persistence.jpa.repositories;

import com.edu.pe.gocareerapi.Profiles.domain.model.aggregates.Profile;
import com.edu.pe.gocareerapi.Profiles.domain.model.valueObjects.EmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {

    Optional<Profile> findByEmail(EmailAddress emailAddress);
}
