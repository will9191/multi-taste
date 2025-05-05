package com.api.product_service.services;

import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.SingleProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SingleProductServiceImpl implements SingleProductService {
    private final SingleProductRepository repository;

    @Override
    public List<SingleProduct> findAll() {
        return repository.findAll();
    }

    @Override
    public SingleProduct findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
