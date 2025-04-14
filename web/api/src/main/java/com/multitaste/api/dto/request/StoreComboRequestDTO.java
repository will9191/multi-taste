package com.multitaste.api.dto.request;

import java.math.BigDecimal;

public record StoreComboRequestDTO(
        Long storeId,
        Long comboId,
        BigDecimal price
) {
}
