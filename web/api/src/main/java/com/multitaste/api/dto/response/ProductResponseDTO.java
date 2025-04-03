package com.multitaste.api.dto.response;

import com.multitaste.api.entities.Ingredient;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record ProductResponseDTO(
        @NotNull(message = "a") String name,
        @NotNull(message = "a") String imgUrl,
        @NotNull(message = "a") BigDecimal price,
        @NotNull(message = "a") BigDecimal discount,
        @NotNull(message = "a") BigDecimal discountPrice,
        @NotNull(message = "a") List<Ingredient> ingredients,
        @NotNull(message = "a") int volume,
        @NotNull(message = "a") LocalDateTime createdAt
) {
}
