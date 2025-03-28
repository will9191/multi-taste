package com.wpizza.api.utils.mappers;

import com.wpizza.api.adapters.outbound.entities.JpaProductEntity;
import com.wpizza.api.domain.product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "jpa.id", target = "id"),
            @Mapping(source = "jpa.name", target = "name"),
            @Mapping(source = "jpa.imgUrl", target = "imgUrl"),
            @Mapping(source = "jpa.price", target = "price"),
            @Mapping(source = "jpa.discount", target = "discount"),
            @Mapping(source = "jpa.discountPrice", target = "discountPrice"),

    })
    Product jpaToEntity(JpaProductEntity jpa);
}
