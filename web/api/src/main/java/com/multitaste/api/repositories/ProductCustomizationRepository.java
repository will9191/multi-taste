package com.multitaste.api.repositories;

import com.multitaste.api.entities.ProductCustomization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductIngredientRepository extends JpaRepository<ProductCustomization, UUID> {
}
