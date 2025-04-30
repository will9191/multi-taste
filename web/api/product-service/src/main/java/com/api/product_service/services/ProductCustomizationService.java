package com.api.product_service.services;

import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.response.ProductCustomizationResponse;

import java.util.List;

public interface ProductCustomizationService {
    ProductCustomizationResponse findById(Long id);
    ProductCustomizationResponse save(ProductCustomizationRequest dto);
    List<ProductCustomizationResponse> saveAll(List<ProductCustomizationRequest> dto);
}
