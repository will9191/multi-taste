package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    Product save (ProductRequestDTO dto);
    List<Product> saveAll(List<ProductRequestDTO> dtoList);

    Page<Product> getProducts(String name, String category, int pageNo, int PageSize);

    List<Product> findAll();
}
