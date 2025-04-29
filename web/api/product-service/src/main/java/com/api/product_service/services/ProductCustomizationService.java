package com.api.product_service.services;

import com.api.product_service.dto.request.ProductCustomizationRequestDTO;
import com.api.product_service.dto.response.ProductCustomizationResponseDTO;

import java.util.List;

public interface ProductCustomizationService {
    ProductCustomizationResponseDTO findById(Long id);
    ProductCustomizationResponseDTO save(ProductCustomizationRequestDTO dto);
    List<ProductCustomizationResponseDTO> saveAll(List<ProductCustomizationRequestDTO> dto);
}
