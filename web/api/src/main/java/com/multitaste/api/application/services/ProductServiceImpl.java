package com.multitaste.api.application.services;


import com.multitaste.api.application.usecases.ProductUseCases;
import com.multitaste.api.domain.product.Product;
import com.multitaste.api.domain.product.ProductRepository;
import com.multitaste.api.domain.product.ProductRequestDTO;
import com.multitaste.api.utils.mappers.ProductMapper;
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
