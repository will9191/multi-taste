package com.multitaste.api.repositories;

import com.multitaste.api.entities.ProductBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductBaseRepository extends JpaRepository<ProductBase, UUID> {
    Page<ProductBase> findAll(Specification<ProductBase> spec, Pageable pageable);
}
