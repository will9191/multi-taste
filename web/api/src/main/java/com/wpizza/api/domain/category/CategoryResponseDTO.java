package com.wpizza.api.domain.category;

import com.wpizza.api.domain.product.Product;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record CategoryResponseDTO(

        @NotNull(message = "Id can not be null") UUID id,
        @NotNull(message = "Name can not be null") String name,
                                  @NotNull(message = "slug can not be null") String slug
        , List<Product> products
) {
}
