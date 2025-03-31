package com.wpizza.api.application.services;

import com.wpizza.api.adapters.outbound.repositories.JpaProductRepository;
import com.wpizza.api.domain.product.Product;
import com.wpizza.api.domain.product.ProductRepository;
import com.wpizza.api.domain.product.ProductRequestDTO;
import com.wpizza.api.utils.mappers.ProductMapper;

public class ProductServiceImpl {
    private ProductRepository repository;
    private ProductMapper mapper;

    public Product save(ProductRequestDTO dto) {
        Product product = this.mapper.dtoToEntity(dto);

        return this.repository.save(product);
    }
}
