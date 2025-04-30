package com.api.store_service.controllers;

import com.api.store_service.dto.request.StoreRequest;
import com.api.store_service.dto.response.StoreResponse;
import com.api.store_service.services.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService service;


    @PostMapping
    public StoreResponse save(@RequestBody StoreRequest dto) {
        return service.save(dto);
    }

    @PostMapping("/all")
    public List<StoreResponse> saveAll(@RequestBody List<StoreRequest> dtoList) {
        return service.saveAll(dtoList);
    }

    @GetMapping
    public List<StoreResponse> findAll() {
        return this.service.findAll();
    }
}
