package com.multitaste.api.dto.request;

import com.multitaste.api.entities.Ingredient;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductIngredientRequestDTO(
        UUID ingredientId,
        boolean hasIngredient,
        boolean isQuantityAdjustable,
        int quantity,
        BigDecimal additionalPrice
) {


}
