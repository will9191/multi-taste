package com.api.store_service.controllers;

import com.api.store_service.dto.request.ProductRequest;
import com.api.store_service.entities.Product;
import com.api.store_service.factories.ProductCreationStrategyFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreProductController {
    private final ProductCreationStrategyFactory creationStrategy;

    public Product createProduct(ProductRequest product) {
        var strategy= creationStrategy.

    }
}
