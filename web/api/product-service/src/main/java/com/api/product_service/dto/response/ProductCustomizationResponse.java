package com.api.product_service.dto.response;

import java.math.BigDecimal;

public record ProductCustomizationResponse(
        Long id,
        CustomizationResponse customization,
        int quantity,
        BigDecimal additionalPrice,
        int additionalQuantity,
        int minQuantity,
        int maxQuantity,
        boolean includedByDefault
) {
}
