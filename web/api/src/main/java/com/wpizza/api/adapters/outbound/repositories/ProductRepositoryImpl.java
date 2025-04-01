package com.wpizza.api.adapters.outbound.repositories;

import com.wpizza.api.adapters.outbound.entities.JpaProductEntity;
import com.wpizza.api.domain.product.Product;
import com.wpizza.api.domain.product.ProductRepository;
import com.wpizza.api.utils.mappers.ProductMapper;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {
    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper mapper;

    @Override
    public Product save(Product product) {
        JpaProductEntity jpaProductEntity = new JpaProductEntity(product);
        this.jpaProductRepository.save(jpaProductEntity);
        return mapper.jpaToEntity(jpaProductEntity);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
