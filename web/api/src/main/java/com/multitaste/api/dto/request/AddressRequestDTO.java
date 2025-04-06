package com.multitaste.api.dto.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record AddressRequestDTO(

        @NotNull String street,
        @NotNull    String neighborhood,
        @NotNull     int number,
        @NotNull    String city,
        @NotNull    String state,
        @NotNull     String country,
        String complement,
        @NotNull     String residence,
        @NotNull BigDecimal latitude,
        @NotNull    BigDecimal longitude

) {
}
