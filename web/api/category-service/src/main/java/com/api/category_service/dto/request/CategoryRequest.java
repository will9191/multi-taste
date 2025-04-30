package com.api.category_service.dto.request;

public record CategoryRequest(
        String name,
        String slug,
        String icon) {
}
