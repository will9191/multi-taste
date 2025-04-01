package com.wpizza.api.adapters.outbound.repositories;

import com.wpizza.api.adapters.outbound.entities.JpaCategoryEntity;
import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.category.CategoryRepository;
import com.wpizza.api.utils.mappers.CategoryMapper;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
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
