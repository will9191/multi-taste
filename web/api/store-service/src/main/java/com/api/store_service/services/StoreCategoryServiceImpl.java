package com.api.store_service.services;

import com.api.store_service.client.CategoryClient;
import com.api.store_service.dto.request.StoreCategoryRequest;
import com.api.store_service.dto.response.CategoryResponse;
import com.api.store_service.dto.response.StoreCategoryResponse;
import com.api.store_service.entities.StoreCategory;
import com.api.store_service.repositories.StoreCategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImpl implements StoreCategoryService {
    private final StoreCategoryRepository repository;
    private final CategoryClient categoryClient;

    @Override
    public StoreCategoryResponse save(StoreCategoryRequest dto) {
        StoreCategory storeCategory = new StoreCategory();
        storeCategory.setCategoryId(dto.categoryId());
        storeCategory.setStoreId(dto.storeId());

        repository.save(storeCategory);

        ResponseEntity<CategoryResponse> categoryEntity = categoryClient.getCategoryById(storeCategory.getCategoryId());
        CategoryResponse category = categoryEntity.getBody();

        return new StoreCategoryResponse(category);
    }

    @Override
    public List<StoreCategoryResponse> getStoreCategories(Long storeId) {
        List<StoreCategory> storeCategoriesEntities = repository.findAllByStoreId(storeId);

        List<StoreCategoryResponse> storeCategories = new ArrayList<>();

        for (StoreCategory storeCategory : storeCategoriesEntities) {
            ResponseEntity<CategoryResponse> categoryResponse = categoryClient.getCategoryById(storeCategory.getCategoryId());
            CategoryResponse category = categoryResponse.getBody();

            storeCategories.add(new StoreCategoryResponse(category));
        }

        return storeCategories;
    }
}
