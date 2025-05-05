package com.api.product_service.services;

import com.api.product_service.client.CustomizationClient;
import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.response.CustomizationResponse;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.entities.SingleProductCustomization;
import com.api.product_service.repositories.ProductCustomizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCustomizationServiceImpl implements ProductCustomizationService {
    private final ProductCustomizationRepository repository;
    private final CustomizationClient customizationClient;

    @Override
    public ProductCustomizationResponse findById(Long id) {
        SingleProductCustomization singleProductCustomization = repository.findById(id).orElseThrow(() -> new RuntimeException(""));

       ResponseEntity<CustomizationResponse> customizationEntity = customizationClient.getCustomizationById(singleProductCustomization.getId());
       CustomizationResponse customization = customizationEntity.getBody();

        return new ProductCustomizationResponse(
                singleProductCustomization.getId(),
                customization,
                singleProductCustomization.getQuantity(),
                singleProductCustomization.getAdditionalPrice(),
                singleProductCustomization.getAdditionalQuantity(),
                singleProductCustomization.getMinQuantity(),
                singleProductCustomization.getMaxQuantity(),
                singleProductCustomization.isIncludedByDefault()
        );
    }

    @Override
    public ProductCustomizationResponse save(ProductCustomizationRequest dto) {
        SingleProductCustomization singleProductCustomization = new SingleProductCustomization();
        singleProductCustomization.setCustomizationId(dto.customizationId());
        singleProductCustomization.setIncludedByDefault(dto.includedByDefault());
        singleProductCustomization.setQuantityAdjustable(dto.quantityAdjustable());
        singleProductCustomization.setQuantity(dto.quantity());
        singleProductCustomization.setAdditionalQuantity(dto.additionalQuantity());
        singleProductCustomization.setAdditionalPrice(dto.additionalPrice());
        singleProductCustomization.setMinQuantity(dto.minQuantity());
        singleProductCustomization.setMaxQuantity(dto.maxQuantity());

        repository.save(singleProductCustomization);

        CustomizationResponse customization = customizationClient.getCustomizationById(singleProductCustomization.getId()).getBody();


        return new ProductCustomizationResponse(
                singleProductCustomization.getId(),
                customization,
                singleProductCustomization.getQuantity(),
                singleProductCustomization.getAdditionalPrice(),
                singleProductCustomization.getAdditionalQuantity(),
                singleProductCustomization.getMinQuantity(),
                singleProductCustomization.getMaxQuantity(),
                singleProductCustomization.isIncludedByDefault()
        );
    }

    @Override
    public List<ProductCustomizationResponse> saveAll(List<ProductCustomizationRequest> dto) {
        return null;
    }
}
