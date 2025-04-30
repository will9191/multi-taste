package com.api.product_service.dto.request;

import java.math.BigDecimal;
import java.util.List;

public record ProductRequest(
        String name,
        String description,
        String imgUrl,
        List<Long> categoriesIds,
        BigDecimal price,
        BigDecimal discount,
        List<ProductCustomizationRequest> customizations
) {
}
