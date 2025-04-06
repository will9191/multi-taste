package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.ProductBaseRequestDTO;
import com.multitaste.api.entities.ProductBase;
import com.multitaste.api.services.ProductBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductBaseController {
    private final ProductBaseService service;

    @PostMapping
    public ProductBase save(@RequestBody ProductBaseRequestDTO dto){
        return service.save(dto);
    }

//    @GetMapping
//    public Page<ProductBase> getProducts(@RequestParam(required = false) String name,@RequestParam(required = false) String category, @RequestParam(defaultValue = "0", required = false) int pageNo, @RequestParam(defaultValue = "25", required = false) int pageSize) {
//        return service.getProducts(name, category, pageNo, pageSize);
//    }

    @GetMapping
    public List<ProductBase> findAll(){
        return service.findAll();
    }
}
