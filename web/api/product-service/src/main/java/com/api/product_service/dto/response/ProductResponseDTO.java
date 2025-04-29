package com.api.product_service.dto.response;

import com.api.product_service.dto.request.ProductCustomizationRequestDTO;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponseDTO(
        Long id,
        String name,
        String description,
        String imgUrl,
        List<CategoryResponse> Categories,
        BigDecimal price,
        BigDecimal discount,
        List<ProductCustomizationResponseDTO> customizations
) {
}
