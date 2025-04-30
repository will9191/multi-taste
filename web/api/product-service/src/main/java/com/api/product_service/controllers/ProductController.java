package com.api.product_service.controllers;

import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.entities.Product;
import com.api.product_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public ProductResponse save(@RequestBody ProductRequest dto){
        return service.save(dto);
    }

    @PostMapping("/all")
    public List<ProductResponse> saveAll(@RequestBody List<ProductRequest> dtoList) {
        return service.saveAll(dtoList);
    }

//    @GetMapping
//    public Page<Product> getProducts(@RequestParam(required = false) String name,@RequestParam(required = false) String category, @RequestParam(defaultValue = "0", required = false) int pageNo, @RequestParam(defaultValue = "25", required = false) int pageSize) {
//        return service.getProducts(name, category, pageNo, pageSize);
//    }

    @GetMapping
    public List<ProductResponse> findAll(){
        return service.findAll();
    }
}
