package com.api.category_service.services;

import com.api.category_service.dto.request.CategoryRequestDTO;
import com.api.category_service.entities.Category;
import com.api.category_service.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository repository;

    @Override
    public Category save(CategoryRequestDTO dto) {
        Category category = new Category();

        category.setName(dto.name());
        category.setSlug(dto.slug());
        category.setIcon(dto.icon());

        return repository.save(category);
    }

    @Override
    public List<Category> saveAll(List<CategoryRequestDTO> dtoList) {
        List<Category> categories = new ArrayList<>();

        for (CategoryRequestDTO dto:dtoList) {
            Category category = this.save(dto);
            categories.add(category);
        }
        return categories;
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category edit(CategoryRequestDTO dto) {
        Optional<Category> optionalCategory = repository.findById(dto.id());

        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            return repository.save(category);
        }

        return new Category();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> optionalCategory = repository.findById(id);
        return optionalCategory.orElse(null);
    }
}
