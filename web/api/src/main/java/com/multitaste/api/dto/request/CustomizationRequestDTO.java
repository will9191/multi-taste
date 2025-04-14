package com.multitaste.api.dto.request;

import java.math.BigDecimal;
import java.util.UUID;

public record IngredientRequestDTO(
        String name,
        String imgUrl,
        BigDecimal commonAdditionalPrice
) {
}
