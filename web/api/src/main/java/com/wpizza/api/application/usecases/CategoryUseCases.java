package com.wpizza.api.application.usecases;

import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRequestDTO;

public interface CategoryUseCases {
    public Category save(CategoryRequestDTO dto);
}
