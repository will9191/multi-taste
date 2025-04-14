package com.multitaste.api.repositories;

import com.multitaste.api.entities.Customization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomizationRepository extends JpaRepository<Customization, Long> {
}
