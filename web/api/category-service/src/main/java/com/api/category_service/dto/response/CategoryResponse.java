package com.api.category_service.dto.response;

public record CategoryResponse(
        Long id,
        String name,
        String slug,
        String icon
) {
}
