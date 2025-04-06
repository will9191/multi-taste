package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductBaseRequestDTO;
import com.multitaste.api.entities.ProductBase;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductBaseService {
    ProductBase save (ProductBaseRequestDTO dto);

    Page<ProductBase> getProducts(String name, String category, int pageNo, int PageSize);

    List<ProductBase> findAll();
}
