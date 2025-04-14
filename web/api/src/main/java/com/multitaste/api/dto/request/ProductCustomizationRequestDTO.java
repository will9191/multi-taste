package com.multitaste.api.dto.request;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductCustomizationRequestDTO(
        Long customizationId,
        boolean includedByDefault,
        boolean quantityAdjustable,
        int quantity,
        int additionalQuantity,
        BigDecimal additionalPrice,
        int minQuantity,
        int maxQuantity
) {


}
