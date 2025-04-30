package com.api.product_service.dto.response;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponse(
        Long id,
        String name,
        String description,
        String imgUrl,
        List<Long> categories,
        BigDecimal price,
        BigDecimal discount,
        List<ProductCustomizationResponse> customizations
) {
}
