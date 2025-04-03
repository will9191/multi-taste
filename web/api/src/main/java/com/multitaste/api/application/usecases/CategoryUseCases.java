package com.multitaste.api.application.usecases;

import com.multitaste.api.domain.category.Category;
import com.multitaste.api.domain.category.CategoryRequestDTO;

import java.util.List;
import java.util.UUID;

public interface CategoryUseCases {
    public Category save(CategoryRequestDTO dto);

    public List<Category> findAll();

    public void deleteById(UUID id);

}
