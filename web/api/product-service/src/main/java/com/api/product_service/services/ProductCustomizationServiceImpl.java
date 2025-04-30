package com.api.product_service.services;

import com.api.product_service.client.CustomizationClient;
import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.response.CustomizationResponse;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.entities.ProductCustomization;
import com.api.product_service.repositories.ProductCustomizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCustomizationServiceImpl implements ProductCustomizationService {
    private final ProductCustomizationRepository repository;
    private final CustomizationClient customizationClient;

    @Override
    public ProductCustomizationResponse findById(Long id) {
        ProductCustomization productCustomization = repository.findById(id).orElseThrow(() -> new RuntimeException(""));

       ResponseEntity<CustomizationResponse> customizationEntity = customizationClient.getCustomizationById(productCustomization.getId());
       CustomizationResponse customization = customizationEntity.getBody();

        return new ProductCustomizationResponse(
                productCustomization.getId(),
                customization,
                productCustomization.getQuantity(),
                productCustomization.getAdditionalPrice(),
                productCustomization.getAdditionalQuantity(),
                productCustomization.getMinQuantity(),
                productCustomization.getMaxQuantity(),
                productCustomization.isIncludedByDefault()
        );
    }

    @Override
    public ProductCustomizationResponse save(ProductCustomizationRequest dto) {
        ProductCustomization productCustomization = new ProductCustomization();
        productCustomization.setCustomizationId(dto.customizationId());
        productCustomization.setIncludedByDefault(dto.includedByDefault());
        productCustomization.setQuantityAdjustable(dto.quantityAdjustable());
        productCustomization.setQuantity(dto.quantity());
        productCustomization.setAdditionalQuantity(dto.additionalQuantity());
        productCustomization.setAdditionalPrice(dto.additionalPrice());
        productCustomization.setMinQuantity(dto.minQuantity());
        productCustomization.setMaxQuantity(dto.maxQuantity());

        repository.save(productCustomization);

        CustomizationResponse customization = customizationClient.getCustomizationById(productCustomization.getId()).getBody();


        return new ProductCustomizationResponse(
                productCustomization.getId(),
                customization,
                productCustomization.getQuantity(),
                productCustomization.getAdditionalPrice(),
                productCustomization.getAdditionalQuantity(),
                productCustomization.getMinQuantity(),
                productCustomization.getMaxQuantity(),
                productCustomization.isIncludedByDefault()
        );
    }

    @Override
    public List<ProductCustomizationResponse> saveAll(List<ProductCustomizationRequest> dto) {
        return null;
    }
}
