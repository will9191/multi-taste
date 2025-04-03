package com.multitaste.api.utils.mappers;

import com.multitaste.api.dto.request.AddressRequestDTO;
import com.multitaste.api.dto.response.AddressResponseDTO;
import com.multitaste.api.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "dto.street", target = "street"),
            @Mapping(source = "dto.neighborhood", target = "neighborhood"),
            @Mapping(source = "dto.number", target = "number"),
            @Mapping(source = "dto.city", target = "city"),
            @Mapping(source = "dto.state", target = "state"),
            @Mapping(source = "dto.country", target = "country"),
            @Mapping(source = "dto.complement", target = "complement"),
            @Mapping(source = "dto.residence", target = "residence"),
            @Mapping(source = "dto.longitude", target = "longitude"),
            @Mapping(source = "dto.latitude", target = "latitude"),

    })
    Address dtoToEntity(AddressRequestDTO dto);

    @Mappings({
            @Mapping(source = "entity.id" ,target = "id"),
            @Mapping(source = "entity.street", target = "street"),
            @Mapping(source = "entity.neighborhood", target = "neighborhood"),
            @Mapping(source = "entity.number", target = "number"),
            @Mapping(source = "entity.city", target = "city"),
            @Mapping(source = "entity.state", target = "state"),
            @Mapping(source = "entity.country", target = "country"),
            @Mapping(source = "entity.complement", target = "complement"),
            @Mapping(source = "entity.residence", target = "residence"),
            @Mapping(source = "entity.longitude", target = "longitude"),
            @Mapping(source = "entity.latitude", target = "latitude"),

    })
    AddressResponseDTO entityToDTO(Address entity);

    List<AddressResponseDTO> entityToDTOList(List<Address> jpa);
}
