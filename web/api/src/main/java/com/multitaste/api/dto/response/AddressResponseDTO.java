package com.multitaste.api.dto.response;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record AddressResponseDTO(
@NotNull UUID id,
        @NotNull String street,
        @NotNull    String neighborhood,
        @NotNull     int number,
        @NotNull    String city,
        @NotNull    String state,
        @NotNull     String country,
        String complement,
        @NotNull     String residence,
@NotNull     BigDecimal latitude,
        @NotNull BigDecimal longitude

) {
}
