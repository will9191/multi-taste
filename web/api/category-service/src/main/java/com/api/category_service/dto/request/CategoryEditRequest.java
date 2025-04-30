package com.api.category_service.dto.request;

public record CategoryEditRequest(Long id,
                                  String name,
                                  String slug,
                                  String icon) {
}
