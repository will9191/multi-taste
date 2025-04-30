package com.api.category_service.controllers;

import com.api.category_service.dto.request.CategoryEditRequest;
import com.api.category_service.dto.request.CategoryRequest;
import com.api.category_service.dto.response.CategoryResponse;
import com.api.category_service.entities.Category;
import com.api.category_service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService service;

    @PostMapping
    public CategoryResponse save(@RequestBody CategoryRequest dto) {
        return service.save(dto);
    }

    @PostMapping("/all")
    public List<CategoryResponse> saveAll(@RequestBody List<CategoryRequest> dto) {
        return service.saveAll(dto);
    }

    @GetMapping
    public List<CategoryResponse> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CategoryResponse getCategoryById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping
    public CategoryResponse edit(@RequestBody CategoryEditRequest dto) {
        return service.edit(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestParam Long id) {
        service.deleteById(id);
    }

}
