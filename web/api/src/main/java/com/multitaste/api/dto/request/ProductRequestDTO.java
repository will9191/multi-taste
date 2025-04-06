package com.multitaste.api.dto.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ProductBaseRequestDTO(
        @NotNull(message = "a") String name,
        @NotNull(message = "a") String imgUrl,
        @NotNull(message = "a") BigDecimal price,
        @NotNull(message = "a") BigDecimal discount,
        @NotNull(message = "a") BigDecimal discountPrice,
        @NotNull(message = "a") List<ProductIngredientRequestDTO> ingredients,
        List<UUID> categoriesIds,
        @NotNull(message = "a") int volume, @NotNull(message = "a") LocalDateTime createdAt
) {
}