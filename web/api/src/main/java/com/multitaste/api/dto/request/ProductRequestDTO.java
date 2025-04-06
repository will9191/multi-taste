package com.multitaste.api.dto.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ProductRequestDTO(
        @NotNull(message = "a") String name,
        @NotNull(message = "a") String imgUrl,
        @NotNull(message = "a") BigDecimal commonPrice,
        @NotNull(message = "a") List<ProductIngredientRequestDTO> ingredients,
        List<UUID> categoriesIds,
        @NotNull(message = "a") LocalDateTime createdAt
) {
}