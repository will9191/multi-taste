package com.multitaste.api.utils.mappers;


import com.multitaste.api.dto.request.StoreRequestDTO;
import com.multitaste.api.dto.response.StoreResponseDTO;
import com.multitaste.api.entities.Store;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "Spring", uses = AddressMapper.class)
public interface StoreMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "dto.name", target = "name"),
            @Mapping(source = "dto.address", target = "address"),
            @Mapping(source = "dto.createdAt", target = "createdAt"),

    })
    Store dtoToEntity(StoreRequestDTO dto);

    @Mappings({
            @Mapping(source = "entity.id", target = "id"),
            @Mapping(source = "entity.name", target = "name"),
            @Mapping(source = "entity.address", target = "address"), @Mapping(source = "entity.createdAt", target = "createdAt"),
    })
    StoreResponseDTO entityToDTO(Store entity);


    List<StoreResponseDTO> entityToDTOList(List<Store> jpa);
}
