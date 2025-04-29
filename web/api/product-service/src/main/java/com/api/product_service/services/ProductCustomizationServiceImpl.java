package com.api.product_service.services;

import com.api.product_service.dto.request.ProductCustomizationRequestDTO;
import com.api.product_service.dto.response.CustomizationResponseDTO;
import com.api.product_service.dto.response.ProductCustomizationResponseDTO;
import com.api.product_service.entities.ProductCustomization;
import com.api.product_service.repositories.ProductCustomizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCustomizationServiceImpl implements ProductCustomizationService {
    private final ProductCustomizationRepository repository;
    private WebClient webClient;

    @Override
    public ProductCustomizationResponseDTO findById(Long id) {
        ProductCustomization productCustomization = repository.findById(id).orElseThrow(() -> new RuntimeException(""));

        CustomizationResponseDTO customization = webClient
                .get()
                .uri("http://localhost:8080/customization/" + productCustomization.getCustomizationId())
                .retrieve()
                .bodyToMono(CustomizationResponseDTO.class)
                .block();

        return new ProductCustomizationResponseDTO(
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
    public ProductCustomizationResponseDTO save(ProductCustomizationRequestDTO dto) {
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

        CustomizationResponseDTO customization = webClient
                .get()
                .uri("http://localhost:8080/customization/" + productCustomization.getCustomizationId())
                .retrieve()
                .bodyToMono(CustomizationResponseDTO.class)
                .block();


        return new ProductCustomizationResponseDTO(
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
    public List<ProductCustomizationResponseDTO> saveAll(List<ProductCustomizationRequestDTO> dto) {
        return null;
    }
}
