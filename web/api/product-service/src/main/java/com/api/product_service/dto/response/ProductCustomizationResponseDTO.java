package com.api.product_service.dto.response;

import java.math.BigDecimal;

public record ProductCustomizationResponseDTO(
        Long id,
        CustomizationResponseDTO customizationResponse,
        int quantity,
        BigDecimal additionalPrice,
        int additionalQuantity,
        int minQuantity,
        int maxQuantity,
        boolean includedByDefault
) {
}
