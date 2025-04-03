package com.multitaste.api.adapters.outbound.repositories;

import com.multitaste.api.adapters.outbound.entities.JpaCategoryEntity;
import com.multitaste.api.domain.category.Category;
import com.multitaste.api.domain.category.CategoryRepository;
import com.multitaste.api.utils.mappers.CategoryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private final JpaCategoryRepository jpaCategoryRepository;
   private final CategoryMapper mapper;

    public CategoryRepositoryImpl(JpaCategoryRepository jpaCategoryRepository, CategoryMapper mapper) {
        this.jpaCategoryRepository = jpaCategoryRepository;
        this.mapper = mapper;
    }

    @Override
    public Category save(Category category) {
        JpaCategoryEntity categoryEntity = new JpaCategoryEntity(category);
        this.jpaCategoryRepository.save(categoryEntity);
        return mapper.jpaToDomain(categoryEntity);
    }

    @Override
    public List<Category> findAll() {
        List<JpaCategoryEntity> jpaCategoryEntities = this.jpaCategoryRepository.findAll();
        return mapper.jpaToDomainList(jpaCategoryEntities);
    }

    @Override
    public void deleteById(UUID id) {
        jpaCategoryRepository.deleteById(id);
    }
}
