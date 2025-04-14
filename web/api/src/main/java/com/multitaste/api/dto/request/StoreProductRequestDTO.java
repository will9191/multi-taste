package com.multitaste.api.dto.request;

import java.math.BigDecimal;

public record StoreProductRequestDTO(
        Long storeId,
        Long productId,
        BigDecimal price,
        BigDecimal discount
) {
}
