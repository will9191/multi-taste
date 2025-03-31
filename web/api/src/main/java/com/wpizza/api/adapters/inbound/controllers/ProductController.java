package com.wpizza.api.adapters.inbound.controllers;

import com.wpizza.api.application.services.ProductServiceImpl;
import com.wpizza.api.domain.product.Product;
import com.wpizza.api.domain.product.ProductRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    ProductServiceImpl service;

    public Product save(ProductRequestDTO dto){
        return service.save(dto);
    }
}
