package com.api.category_service.services;

import com.api.category_service.dto.request.CategoryEditRequest;
import com.api.category_service.dto.request.CategoryRequest;
import com.api.category_service.dto.response.CategoryResponse;
import com.api.category_service.entities.Category;
import com.api.category_service.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    @Override
    public CategoryResponse save(CategoryRequest dto) {
        Category category = Category.builder()
                .name(dto.name())
                .slug(dto.slug())
                .icon(dto.icon())
                .build();

        repository.save(category);
        log.info("Category created successfully");

        return new CategoryResponse(category.getId(), category.getName(), category.getSlug(), category.getIcon());
    }

    @Override
    public List<CategoryResponse> saveAll(List<CategoryRequest> dtoList) {
        List<CategoryResponse> categories = new ArrayList<>();

        for (CategoryRequest dto : dtoList) {
            CategoryResponse category = this.save(dto);
            categories.add(category);
        }
        return categories;
    }

    @Override
    public List<CategoryResponse> findAll() {
        List<Category> categoriesEntity = repository.findAll();

        List<CategoryResponse> categories = new ArrayList<>();

        for (Category category : categoriesEntity) {
            categories.add(new CategoryResponse(category.getId(), category.getName(), category.getSlug(), category.getIcon()));
        }

        return categories;
    }

    @Override
    public CategoryResponse edit(CategoryEditRequest dto) {
        Optional<Category> optionalCategory = repository.findById(dto.id());

        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            repository.save(category);

            return new CategoryResponse(category.getId(), category.getName(), category.getSlug(), category.getIcon());
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CategoryResponse findById(Long id) {
        Category category = repository.findById(id).orElse(null);

        return new CategoryResponse(category.getId(), category.getName(), category.getSlug(), category.getIcon());
    }
}
