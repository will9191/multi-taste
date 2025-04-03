package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Product;
import com.multitaste.api.repositories.ProductRepository;
import com.multitaste.api.utils.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public Product save(ProductRequestDTO dto) {
        Product product = mapper.dtoToEntity(dto);

        return repository.save(product);
    }
}
