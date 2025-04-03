package com.multitaste.api.dto.request;

import jakarta.validation.constraints.NotNull;

public record CategoryRequestDTO (
        @NotNull(message = "Name can not be null") String name,
        @NotNull(message = "slug can not be null") String slug
) {

}