package com.multitaste.api.adapters.outbound.repositories;

import com.multitaste.api.adapters.outbound.entities.JpaProductEntity;
import com.multitaste.api.domain.product.Product;
import com.multitaste.api.domain.product.ProductRepository;
import com.multitaste.api.utils.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
