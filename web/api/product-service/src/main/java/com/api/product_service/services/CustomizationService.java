package com.api.customization_service.services;

import com.api.customization_service.dto.request.CustomizationRequestDTO;
import com.api.customization_service.dto.response.CustomizationResponseDTO;

import java.util.List;

public interface CustomizationService {
    CustomizationResponseDTO save(CustomizationRequestDTO dto);

    List<CustomizationResponseDTO> saveAll(List<CustomizationRequestDTO> dtoList);
    List<CustomizationResponseDTO> findAll();
    CustomizationResponseDTO findById(Long id);
}
