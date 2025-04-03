package com.multitaste.api.utils.mappers;


import com.multitaste.api.adapters.outbound.entities.JpaCategoryEntity;
import com.multitaste.api.domain.category.Category;
import com.multitaste.api.domain.category.CategoryRequestDTO;
import com.multitaste.api.domain.category.CategoryResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = ProductMapper.class)
public interface CategoryMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "dto.name", target = "name"),
            @Mapping(source = "dto.slug", target = "slug"),
            @Mapping(target = "products", ignore = true)
    })
    Category dtoToEntity(CategoryRequestDTO dto);

    @Mappings({
            @Mapping(source = "entity.id", target = "id"),
            @Mapping(source = "entity.name", target = "name"),
            @Mapping(source = "entity.slug", target = "slug"),
            @Mapping(source = "entity.products", target = "products")
    })
    CategoryResponseDTO entityToDTO(Category entity);

    @Mappings({
            @Mapping(source = "jpa.id", target = "id"),
            @Mapping(source = "jpa.name", target = "name"),
            @Mapping(source = "jpa.slug", target = "slug"),
            @Mapping(source = "jpa.products", target = "products")
    })
    Category jpaToDomain(JpaCategoryEntity jpa);

    List<Category> jpaToDomainList(List<JpaCategoryEntity> jpa);
}
