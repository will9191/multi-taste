package com.multitaste.api.domain.category;

import jakarta.validation.constraints.NotNull;

public record CategoryRequestDTO (
        @NotNull(message = "Name can not be null") String name,
        @NotNull(message = "slug can not be null") String slug
) {

}
