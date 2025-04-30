package com.api.store_service.dto.request;

public record StoreRequest(
        String name,
        AddressRequest address
) {
}
