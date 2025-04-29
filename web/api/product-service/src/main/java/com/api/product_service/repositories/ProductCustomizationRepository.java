package com.api.product_service.repositories;

import com.api.product_service.entities.ProductCustomization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCustomizationRepository extends JpaRepository<ProductCustomization, Long> {
}
