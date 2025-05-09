package com.api.product_service.services;

import com.api.product_service.entities.SingleProduct;

import java.util.List;

public interface SingleProductService {
    List<SingleProduct> findAll();
    SingleProduct findById(Long id);
}
