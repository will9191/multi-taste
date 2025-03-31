package com.wpizza.api.domain.product;

import com.wpizza.api.domain.ingredient.Ingredient;
import jakarta.validation.constraints.NotNull;


import java.math.BigDecimal;
import java.util.List;

public record ProductRequestDTO(
        @NotNull(message = "a") String name,
        @NotNull(message = "a") String imgUrl,
        @NotNull(message = "a") BigDecimal price,
        @NotNull(message = "a") BigDecimal discount,
        @NotNull(message = "a") BigDecimal discountPrice,
        @NotNull(message = "a") List<Ingredient> ingredients,
        @NotNull(message = "a") int volume) {
}
