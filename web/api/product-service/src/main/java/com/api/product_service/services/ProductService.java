package com.api.product_service.services;

import com.api.product_service.dto.request.ProductRequestDTO;
import com.api.product_service.dto.response.ProductResponseDTO;
import com.api.product_service.entities.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    Product save (ProductRequestDTO dto);
    List<Product> saveAll(List<ProductRequestDTO> dtoList);

//    Page<Product> getProducts(String name, String category, int pageNo, int PageSize);

    List<Product> findAll();

    ProductResponseDTO findById(Long id);
}
