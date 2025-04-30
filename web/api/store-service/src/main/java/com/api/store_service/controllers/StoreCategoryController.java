package com.api.store_service.controllers;

import com.api.store_service.dto.request.StoreCategoryRequest;
import com.api.store_service.dto.response.StoreCategoryResponse;
import com.api.store_service.services.StoreCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store-category")
@RequiredArgsConstructor
public class StoreCategoryController {
    private final StoreCategoryService service;

    @PostMapping
    public StoreCategoryResponse save(@RequestBody StoreCategoryRequest dto) {
        return service.save(dto);
    }

    @GetMapping("/{storeId}")
    public List<StoreCategoryResponse> getByStoreId(@PathVariable("storeId") Long storeId) {
        return service.getStoreCategories(storeId);
    }
}
