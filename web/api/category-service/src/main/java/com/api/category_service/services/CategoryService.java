package com.api.category_service.services;

import com.api.category_service.dto.request.CategoryEditRequest;
import com.api.category_service.dto.request.CategoryRequest;
import com.api.category_service.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse save(CategoryRequest dto);
    List<CategoryResponse> saveAll(List<CategoryRequest> dto);

    List<CategoryResponse> findAll();

    CategoryResponse edit(CategoryEditRequest dto);

    void deleteById(Long id);

    CategoryResponse findById(Long id);
}
