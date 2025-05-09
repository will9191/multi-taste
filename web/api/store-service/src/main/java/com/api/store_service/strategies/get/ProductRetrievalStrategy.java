package com.api.product_service.strategies.get;

import com.api.product_service.dto.response.ProductResponse;
import java.util.List;

public interface ProductRetrievalStrategy<T extends ProductResponse> {
    List<T> getProducts();
    T getProduct(Long id);
}
