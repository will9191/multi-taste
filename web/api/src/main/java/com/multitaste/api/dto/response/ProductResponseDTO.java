package com.multitaste.api.dto.response;

import com.multitaste.api.entities.ProductIngredient;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record ProductResponseDTO(
        @NotNull(message = "a") String name,
        @NotNull(message = "a") String imgUrl,
        @NotNull(message = "a") BigDecimal commonPrice,
        @NotNull(message = "a") List<ProductIngredient> ingredients,
        @NotNull(message = "a") LocalDateTime createdAt
) {
}
