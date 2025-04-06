package com.multitaste.api.dto.request;

import java.util.UUID;

public record CategoryRequestDTO(
        UUID id,
        String name,
        String slug,
        String imgUrl
) {

}