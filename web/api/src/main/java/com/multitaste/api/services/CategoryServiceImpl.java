package com.multitaste.api.services;

import com.multitaste.api.dto.request.CategoryRequestDTO;
import com.multitaste.api.entities.Category;
import com.multitaste.api.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    @Override
    public Category save(CategoryRequestDTO dto) {
        Category category = new Category();

        category.setName(dto.name());
        category.setSlug(dto.slug());
        category.setImgUrl(dto.imgUrl());

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
            category.setImgUrl(dto.imgUrl());
            return repository.save(category);
        }

        return new Category();
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
