package com.api.product_service.services;

import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.entities.Product;

import java.util.List;

public interface ProductService {
    ProductResponse save (ProductRequest dto);
    List<ProductResponse> saveAll(List<ProductRequest> dtoList);

//    Page<Product> getProducts(String name, String category, int pageNo, int PageSize);

    List<ProductResponse> findAll();

    ProductResponse findById(Long id);
}
