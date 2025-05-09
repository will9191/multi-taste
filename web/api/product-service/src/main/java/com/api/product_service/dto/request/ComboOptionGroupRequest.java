package com.api.product_service.dto.request;

import java.util.List;

public record ComboOptionGroupRequest(
        String name,
        int minSelect,
        int maxSelect,
        List<ComboOptionRequest> comboOptions
) {
}
