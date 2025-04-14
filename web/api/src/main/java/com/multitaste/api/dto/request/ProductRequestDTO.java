package com.multitaste.api.dto.request;

import com.multitaste.api.entities.NutritionalInformation;

import java.math.BigDecimal;
import java.util.List;

public record ProductRequestDTO(
        String name,
        String description,
        String imgUrl,
        List<Long> categoriesIds,
        BigDecimal price,
        BigDecimal discount,
        List<ProductCustomizationRequestDTO> customizations,
        List<NutritionalInformation> nutritionalInformation
) {
}