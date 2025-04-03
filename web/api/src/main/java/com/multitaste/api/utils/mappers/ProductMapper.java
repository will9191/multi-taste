package com.multitaste.api.utils.mappers;

import com.multitaste.api.adapters.outbound.entities.JpaProductEntity;
import com.multitaste.api.domain.product.Product;
import com.multitaste.api.domain.product.ProductRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "dto.name", target = "name"),
            @Mapping(source = "dto.imgUrl", target = "imgUrl"),
            @Mapping(source = "dto.price", target = "price"),
            @Mapping(source = "dto.discount", target = "discount"),
            @Mapping(source = "dto.discountPrice", target = "discountPrice"),
    })
    Product dtoToEntity(ProductRequestDTO dto);

    @Mappings({
            @Mapping(source = "entity.name", target = "name"),
            @Mapping(source = "entity.imgUrl", target = "imgUrl"),
            @Mapping(source = "entity.price", target = "price"),
            @Mapping(source = "entity.discount", target = "discount"),
            @Mapping(source = "entity.discountPrice", target = "discountPrice"),

    })
    ProductRequestDTO entityToDTO(Product entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "jpa.name", target = "name"),
            @Mapping(source = "jpa.imgUrl", target = "imgUrl"),
            @Mapping(source = "jpa.price", target = "price"),
            @Mapping(source = "jpa.discount", target = "discount"),
            @Mapping(source = "jpa.discountPrice", target = "discountPrice"),
            @Mapping(source = "jpa.ingredients", target = "ingredients"),
            @Mapping(source = "jpa.volume", target = "volume"),
    })
    Product jpaToEntity(JpaProductEntity jpa);
}
