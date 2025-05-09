package com.api.store_service.dto.request;

public record StoreCategoryRequest(
        Long categoryId,
        Long storeId
) {
}
