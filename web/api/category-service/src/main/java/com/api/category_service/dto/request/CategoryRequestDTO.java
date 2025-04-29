package com.api.category_service.dto.request;

public record CategoryRequestDTO(
        Long id,
        String name,
                                 String slug,
                                 String icon) {
}
