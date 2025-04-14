package com.multitaste.api.dto.request;

import java.util.List;

public record ComboOptionGroupRequestDTO(
        String name,
        int minSelect,
        int maxSelect,
        List<ComboOptionRequestDTO> comboOptions
) {
}
