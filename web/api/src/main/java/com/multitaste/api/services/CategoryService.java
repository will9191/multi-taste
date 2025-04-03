package com.multitaste.api.services;

import com.multitaste.api.dto.request.CategoryRequestDTO;
import com.multitaste.api.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    Category save(CategoryRequestDTO dto);

    List<Category> findAll();

    void deleteById(UUID id);

}
