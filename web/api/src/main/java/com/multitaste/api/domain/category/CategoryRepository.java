package com.multitaste.api.domain.category;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository {
    Category save(Category category);

    List<Category> findAll();

    void deleteById(UUID id);
}
