package com.multitaste.api.dto.request;

public record StoreProductIngredientResquestDTO(
        Long storeId,
        Long productIngredientId,
        int quantity,
        int additionalQuantity,
        int additionalPrice,
        int maxQuantity,
        int minQuantity
) {
}
