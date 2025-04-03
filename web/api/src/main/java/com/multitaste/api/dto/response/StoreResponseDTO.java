package com.multitaste.api.dto.response;

import com.multitaste.api.dto.request.AddressRequestDTO;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record StoreResponseDTO(
        @NotNull UUID id,
        @NotNull String name,
        @NotNull AddressRequestDTO address,
        @NotNull(message = "a") LocalDateTime createdAt
) {
}
