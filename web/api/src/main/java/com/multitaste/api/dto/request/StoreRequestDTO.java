package com.multitaste.api.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record StoreRequestDTO (
        @NotNull String name,
        @NotNull AddressRequestDTO address, @NotNull(message = "a") LocalDateTime createdAt
) {
}
