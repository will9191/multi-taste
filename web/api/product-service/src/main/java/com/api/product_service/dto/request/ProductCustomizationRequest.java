package com.api.product_service.dto.request;

import java.math.BigDecimal;

public record ProductCustomizationRequest(Long customizationId,
                                          boolean includedByDefault,
                                          boolean quantityAdjustable,
                                          int quantity,
                                          int additionalQuantity,
                                          BigDecimal additionalPrice,
                                          int minQuantity,
                                          int maxQuantity) {
}
