package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Product;
import com.multitaste.api.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public Product save(@RequestBody ProductRequestDTO dto){
        return service.save(dto);
    }

//    @GetMapping
//    public Page<Product> getProducts(@RequestParam(required = false) String name,@RequestParam(required = false) String category, @RequestParam(defaultValue = "0", required = false) int pageNo, @RequestParam(defaultValue = "25", required = false) int pageSize) {
//        return service.getProducts(name, category, pageNo, pageSize);
//    }

    @GetMapping
    public List<Product> findAll(){
        return service.findAll();
    }
}
