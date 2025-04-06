package com.multitaste.api.dto.response;

import java.math.BigDecimal;
import java.util.UUID;

public record IngredientResponseDTO(
        UUID id,
        String name,
        String imgUrl,
        BigDecimal commonAdditionalPrice
) {
}
