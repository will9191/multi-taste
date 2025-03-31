package com.wpizza.api.adapters.inbound.controllers;

import com.wpizza.api.application.services.CategoryServiceImpl;
import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private CategoryServiceImpl service;

    public Category save(CategoryRequestDTO dto) {
       return this.service.save(dto);
    }
}
