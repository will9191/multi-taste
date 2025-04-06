package com.multitaste.api.dto.response;

import com.multitaste.api.entities.Product;

import java.util.List;
import java.util.UUID;

public record CategoryResponseDTO(UUID id,
                                  String name,
                                  String slug,
                                  String imgUrl,
                                  List<Product> products) {
}
