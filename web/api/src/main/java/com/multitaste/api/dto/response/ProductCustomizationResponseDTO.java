package com.multitaste.api.dto.response;

import com.multitaste.api.entities.Customization;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductCustomizationResponseDTO(
        UUID id,

        Customization ingredient,
        boolean hasIngredient,
        boolean isQuantityAdjustable,
        int quantity,
        BigDecimal additionalPrice
) {
}
