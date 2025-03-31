package com.wpizza.api.domain.category;

import com.wpizza.api.domain.product.Product;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CategoryRequestDTO (
        @NotNull(message = "Name can not be null") String name,
        @NotNull(message = "slug can not be null") String slug
) {

}
