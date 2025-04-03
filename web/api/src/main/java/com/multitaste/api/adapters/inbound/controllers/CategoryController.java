package com.multitaste.api.adapters.inbound.controllers;

import com.multitaste.api.application.services.CategoryServiceImpl;
import com.multitaste.api.domain.category.Category;
import com.multitaste.api.domain.category.CategoryRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Tag(name = "Category", description = "Manage category information")
public class CategoryController {
    private final CategoryServiceImpl service;

    @PostMapping
    @Operation(summary = "Save new category for products")
    public Category save(@RequestBody CategoryRequestDTO dto) {
        return this.service.save(dto);
    }

    @GetMapping
    public List<Category> findAll () {
        return this.service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }

}
