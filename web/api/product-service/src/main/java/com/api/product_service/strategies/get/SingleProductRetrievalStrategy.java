package com.api.product_service.strategies.get;

import com.api.product_service.dto.response.SingleProductResponse;
import com.api.product_service.entities.Product;
import com.api.product_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SingleProductGetStrategy implements ProductGetStrategy<SingleProductResponse> {
    private final ProductService service;

    @Override
    public List<Product> getProducts() {
         return service.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }
}
