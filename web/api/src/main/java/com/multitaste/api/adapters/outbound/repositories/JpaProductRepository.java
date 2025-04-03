package com.multitaste.api.adapters.outbound.repositories;

import com.multitaste.api.adapters.outbound.entities.JpaProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaProductRepository extends JpaRepository<JpaProductEntity, UUID> {
}
