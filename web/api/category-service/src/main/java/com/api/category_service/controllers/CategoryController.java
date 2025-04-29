package com.api.category_service.controllers;

import com.api.category_service.dto.request.CategoryRequestDTO;
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

    public Category save(@RequestBody CategoryRequestDTO dto) {
        return this.service.save(dto);
    }

    @PostMapping("/all")

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
    public void deleteById(@RequestParam Long id) {
        service.deleteById(id);
    }

}
