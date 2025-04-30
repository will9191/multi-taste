package com.api.store_service.dto.response;

import java.time.LocalDateTime;

public record StoreResponse(
        Long id,
        String name,
        AddressResponse address,
        LocalDateTime createdAt
) {
}
