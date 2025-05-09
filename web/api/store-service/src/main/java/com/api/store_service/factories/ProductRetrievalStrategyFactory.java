package com.api.product_service.factories;

import com.api.product_service.enums.ProductType;
import com.api.product_service.strategies.get.ProductRetrievalStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductRetrievalStrategyFactory {
    private final List<ProductRetrievalStrategy> strategies;

    public ProductRetrievalStrategy resolve(ProductType type) {
        return strategies.stream()
                .filter(strategy ->
                        strategy.getClass()
                                .getSimpleName()
                                .toLowerCase()
                                .contains(type.name().toLowerCase())
                )
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No strategy found for type: " + type));
    }
}
