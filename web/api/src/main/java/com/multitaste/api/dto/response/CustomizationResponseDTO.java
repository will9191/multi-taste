package com.multitaste.api.dto.response;

import java.math.BigDecimal;
import java.util.UUID;

public record CustomizationResponseDTO(
        Long id,
        String name,
        String imgUrl
) {
}
