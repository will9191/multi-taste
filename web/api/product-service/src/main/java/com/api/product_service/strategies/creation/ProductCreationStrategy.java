package com.api.product_service.strategies;

import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.entities.Product;

public interface ProductCreationStrategy {
    Product create(ProductRequest request);
}
