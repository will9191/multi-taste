package com.multitaste.api.services;

import com.multitaste.api.dto.request.CustomizationRequestDTO;
import com.multitaste.api.dto.response.CustomizationResponseDTO;
import com.multitaste.api.entities.Customization;
import com.multitaste.api.repositories.CustomizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomizationServiceImpl implements CustomizationService {
    private final CustomizationRepository repository;


    @Override
    public CustomizationResponseDTO save(CustomizationRequestDTO dto) {

        Customization customization = new Customization();

        customization.setName(dto.name());
        customization.setImgUrl(dto.imgUrl());

        repository.save(customization);

        return new CustomizationResponseDTO(customization.getId(), customization.getName(), customization.getImgUrl());
    }

    @Override
    public List<CustomizationResponseDTO> saveAll(List<CustomizationRequestDTO> dtoList) {

        List<CustomizationResponseDTO> responseDTOList = new ArrayList<>();
        for (CustomizationRequestDTO dto : dtoList) {
            CustomizationResponseDTO response = this.save(dto);
            responseDTOList.add(response);
        }

        return responseDTOList;
    }

    @Override
    public List<CustomizationResponseDTO> findAll() {
        List<Customization> customizations = repository.findAll();

        List<CustomizationResponseDTO> response = new ArrayList<>();

        for (Customization customization : customizations) {
            CustomizationResponseDTO ingredientDTO = new CustomizationResponseDTO(customization.getId(), customization.getName(), customization.getImgUrl());
            response.add(ingredientDTO);
        }

        return response;

    }
}
