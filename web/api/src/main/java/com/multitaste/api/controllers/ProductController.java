package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Product;
import com.multitaste.api.services.ProductServiceImpl;
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
