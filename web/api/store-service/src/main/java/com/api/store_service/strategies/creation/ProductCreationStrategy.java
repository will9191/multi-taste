package com.api.product_service.strategies.creation;

import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.entities.Product;

public interface ProductCreationStrategy<T extends ProductRequest> {
    Product create(T request);
}
