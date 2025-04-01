package com.wpizza.api.application.usecases;

import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRequestDTO;

import java.util.List;
import java.util.UUID;

public interface CategoryUseCases {
    public Category save(CategoryRequestDTO dto);

    public List<Category> findAll();

    public void deleteById(UUID id);

}
