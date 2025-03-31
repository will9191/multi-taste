package com.wpizza.api.application.services;

import com.wpizza.api.application.usecases.CategoryUseCases;
import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRepository;
import com.wpizza.api.domain.category.CategoryRequestDTO;
import com.wpizza.api.utils.mappers.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryUseCases {
    private final CategoryRepository repository;

    @Autowired
    private  CategoryMapper mapper;


    @Override
    public Category save(CategoryRequestDTO dto) {
        Category category = mapper.dtoToEntity(dto);

        return repository.save(category);
    }
}
