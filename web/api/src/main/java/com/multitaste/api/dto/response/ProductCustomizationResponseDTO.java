package com.multitaste.api.dto.response;

import com.multitaste.api.entities.Ingredient;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductIngredientResponseDTO(
        UUID id,

        Ingredient ingredient,
        boolean hasIngredient,
        boolean isQuantityAdjustable,
        int quantity,
        BigDecimal additionalPrice
) {
}
