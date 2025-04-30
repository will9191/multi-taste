package com.api.store_service.services;

import com.api.store_service.dto.request.StoreCategoryRequest;
import com.api.store_service.dto.response.StoreCategoryResponse;

import java.util.List;

public interface StoreCategoryService {
    StoreCategoryResponse save(StoreCategoryRequest dto);
    List<StoreCategoryResponse> getStoreCategories(Long id);
}
