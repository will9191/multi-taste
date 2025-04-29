package com.api.category_service.services;

import com.api.category_service.dto.request.CategoryRequestDTO;
import com.api.category_service.entities.Category;

import java.util.List;

public interface CategoryService {
    Category save(CategoryRequestDTO dto);
    List<Category> saveAll(List<CategoryRequestDTO> dto);

    List<Category> findAll();

    Category edit(CategoryRequestDTO dto);

    void deleteById(Long id);

    Category findById(Long id);
}
