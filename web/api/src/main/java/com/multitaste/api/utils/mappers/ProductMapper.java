package com.multitaste.api.utils.mappers;


import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.dto.response.ProductResponseDTO;
import com.multitaste.api.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "dto.name", target = "name"),
            @Mapping(source = "dto.imgUrl", target = "imgUrl"),
            @Mapping(source = "dto.price", target = "price"),
            @Mapping(source = "dto.discount", target = "discount"),
            @Mapping(source = "dto.discountPrice", target = "discountPrice"),
            @Mapping(source = "dto.createdAt", target = "createdAt"),
    })
    Product dtoToEntity(ProductRequestDTO dto);

    @Mappings({
            @Mapping(source = "entity.name", target = "name"),
            @Mapping(source = "entity.imgUrl", target = "imgUrl"),
            @Mapping(source = "entity.price", target = "price"),
            @Mapping(source = "entity.discount", target = "discount"),
            @Mapping(source = "entity.discountPrice", target = "discountPrice"),
            @Mapping(source = "entity.createdAt", target = "createdAt"),

    })
    ProductResponseDTO entityToDTO(Product entity);
    List<ProductResponseDTO> entityToDTOList(List<Product> entity);
}
