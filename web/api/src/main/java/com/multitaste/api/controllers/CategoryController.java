package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.CategoryRequestDTO;
import com.multitaste.api.entities.Category;
import com.multitaste.api.services.CategoryService;
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
    private final CategoryService service;

    @PostMapping
    @Operation(summary = "Save new category")
    public Category save(@RequestBody CategoryRequestDTO dto) {
        return this.service.save(dto);
    }

    @PostMapping("/all")
    @Operation(summary = "Save new list of categories")
    public List<Category> saveAll(@RequestBody List<CategoryRequestDTO> dto) {
        return this.service.saveAll(dto);
    }


    @GetMapping
    public List<Category> findAll() {
        return this.service.findAll();
    }

    @PutMapping
    public Category edit(@RequestBody CategoryRequestDTO dto) {
        return this.service.edit(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestParam UUID id) {
        service.deleteById(id);
    }

}
