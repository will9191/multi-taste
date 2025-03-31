package com.wpizza.api.adapters.outbound.repositories;

import com.wpizza.api.adapters.outbound.entities.JpaCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaCategoryRepository extends JpaRepository<JpaCategoryEntity, UUID> {
}
