package com.wpizza.api.application.services;


import com.wpizza.api.application.usecases.ProductUseCases;
import com.wpizza.api.domain.product.Product;
import com.wpizza.api.domain.product.ProductRepository;
import com.wpizza.api.domain.product.ProductRequestDTO;
import com.wpizza.api.utils.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductUseCases {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    public Product save(ProductRequestDTO dto) {
        Product product = this.mapper.dtoToEntity(dto);

        return repository.save(product);
    }
}
