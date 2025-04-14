package com.multitaste.api.dto.request;

import java.math.BigDecimal;
import java.util.List;

public record ComboRequestDTO(
        String name,
        String imgUrl,
        List<ComboItemRequestDTO> comboItems,
        List<ComboOptionGroupRequestDTO> comboOptionGroups,
        BigDecimal price,
        BigDecimal discount
) {

}
