package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Product;

public interface ProductService {
    Product save (ProductRequestDTO dto);
}
