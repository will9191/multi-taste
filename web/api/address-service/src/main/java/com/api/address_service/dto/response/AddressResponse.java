package com.api.address_service.dto.response;

import java.math.BigDecimal;

public record AddressResponse(
        Long id,
        String street,
        String neighborhood,
        Integer number,
        String city,
        String state,
        String country,
        String complement,
        String residence,
        BigDecimal latitude,
        BigDecimal longitude
) {
}
