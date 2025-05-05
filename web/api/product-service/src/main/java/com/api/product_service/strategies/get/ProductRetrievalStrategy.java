package com.api.product_service.strategies.get;

import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.entities.Product;

import java.util.List;

public interface ProductGetStrategy<T extends ProductResponse> {
    List<Product> getProducts();
    Product getProduct(Long id);
}
