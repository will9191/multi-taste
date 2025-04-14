package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductCustomizationRequestDTO;
import com.multitaste.api.dto.response.ProductCustomizationResponseDTO;

import java.util.List;

public interface ProductCustomizationService {
    List<ProductCustomizationResponseDTO> saveAll(List<ProductCustomizationRequestDTO> dto);
}
