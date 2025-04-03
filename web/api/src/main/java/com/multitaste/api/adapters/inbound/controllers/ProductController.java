package com.multitaste.api.adapters.inbound.controllers;

import com.multitaste.api.application.services.ProductServiceImpl;
import com.multitaste.api.domain.product.Product;
import com.multitaste.api.domain.product.ProductRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl service;

    @PostMapping

    public Product save(ProductRequestDTO dto){
        return service.save(dto);
    }
}
