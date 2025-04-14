package com.multitaste.api.services;

import com.multitaste.api.dto.request.CustomizationRequestDTO;
import com.multitaste.api.dto.response.CustomizationResponseDTO;

import java.util.List;

public interface CustomizationService {
    CustomizationResponseDTO save(CustomizationRequestDTO dto);

    List<CustomizationResponseDTO> saveAll(List<CustomizationRequestDTO> dtoList);
    List<CustomizationResponseDTO> findAll();
}
