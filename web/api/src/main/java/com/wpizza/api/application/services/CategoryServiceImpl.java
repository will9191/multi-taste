package com.wpizza.api.application.services;

import com.wpizza.api.application.usecases.CategoryUseCases;
import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRepository;
import com.wpizza.api.domain.category.CategoryRequestDTO;
import com.wpizza.api.utils.mappers.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
