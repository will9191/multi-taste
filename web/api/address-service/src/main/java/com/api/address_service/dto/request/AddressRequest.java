package com.api.address_service.dto.request;

import java.math.BigDecimal;

public record AddressRequest(
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
