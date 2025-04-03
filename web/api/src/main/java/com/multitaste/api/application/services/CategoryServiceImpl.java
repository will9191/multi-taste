package com.multitaste.api.application.services;

import com.multitaste.api.application.usecases.CategoryUseCases;
import com.multitaste.api.domain.category.Category;
import com.multitaste.api.domain.category.CategoryRepository;
import com.multitaste.api.domain.category.CategoryRequestDTO;
import com.multitaste.api.utils.mappers.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryUseCases {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;


    @Override
    public Category save(CategoryRequestDTO dto) {
        Category category = mapper.dtoToEntity(dto);

        return repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
