package com.api.store_service.strategies.get;

import com.api.product_service.dto.response.*;
import com.api.product_service.entities.*;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.services.ProductCustomizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComboProductRetrievalStrategy implements ProductRetrievalStrategy<ComboProductResponse> {
    private final ProductRepository productRepository;
    private final ProductCustomizationService productCustomizationService;

    @Override
    public List<ComboProductResponse> getProducts() {
        List<ComboProductResponse> products = new ArrayList<>();

        List<Product> productList = productRepository.findAll();
        for (Product product : productList) {
           products.add(getProduct(product.getId()));
        }

        return products;
    }

    @Override
    public ComboProductResponse getProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));

        if (!(product instanceof Combo combo)) {
            throw new IllegalArgumentException("Product is not a combo");
        }

        List<ComboItemResponse> comboItems = new ArrayList<>();

        for (ComboItem comboItem : combo.getComboItems()) {
            SingleProduct singleProduct = comboItem.getSingleProduct();

            List<ProductCustomizationResponse> customizations = new ArrayList<>();

            for (Long pcId : singleProduct.getProductCustomizationsIds()) {
                customizations.add(productCustomizationService.findById(pcId));
            }

            SingleProductResponse singleProductResponse =
                    new SingleProductResponse(
                            singleProduct.getId(),
                            singleProduct.getName(),
                            singleProduct.getDescription(),
                            singleProduct.getImgUrl(),
                            singleProduct.getPrice(),
                            singleProduct.getDiscount(),
                            singleProduct.getType(),
                            singleProduct.getCategoriesIds(),
                            singleProduct.getCreatedAt(),
                            customizations
                    );

            comboItems.add(
                    new ComboItemResponse(
                            comboItem.getId(),
                            singleProductResponse
                    )
            );
        }

        List<ComboOptionGroupResponse> comboOptionGroups = new ArrayList<>();

        for (ComboOptionGroup comboOptionGroup : combo.getComboOptionGroups()) {

            List<ComboOptionResponse> comboOptions = new ArrayList<>();

            for (ComboOption comboOption : comboOptionGroup.getComboOptions()) {
                SingleProduct singleProduct = comboOption.getSingleProduct();

                List<ProductCustomizationResponse> customizations = new ArrayList<>();

                for (Long pcId : singleProduct.getProductCustomizationsIds()) {
                    customizations.add(productCustomizationService.findById(pcId));
                }

                SingleProductResponse singleProductResponse =
                        new SingleProductResponse(
                                singleProduct.getId(),
                                singleProduct.getName(),
                                singleProduct.getDescription(),
                                singleProduct.getImgUrl(),
                                singleProduct.getPrice(),
                                singleProduct.getDiscount(),
                                singleProduct.getType(),
                                singleProduct.getCategoriesIds(),
                                singleProduct.getCreatedAt(),
                                customizations
                        );

                ComboOptionResponse comboOptionResponse = new ComboOptionResponse(
                        comboOption.getId(),
                        singleProductResponse
                );

                comboOptions.add(comboOptionResponse);
            }

            ComboOptionGroupResponse comboOptionGroupResponse = new ComboOptionGroupResponse(
                    comboOptionGroup.getId(),
                    comboOptionGroup.getName(),
                    comboOptionGroup.getMinSelect(),
                    comboOptionGroup.getMaxSelect(),
                    comboOptions
            );

            comboOptionGroups.add(comboOptionGroupResponse);
        }

        return new ComboProductResponse(
                combo.getId(),
                combo.getName(),
                combo.getDescription(),
                combo.getImgUrl(),
                combo.getPrice(),
                combo.getDiscount(),
                combo.getType(),
                combo.getCategoriesIds(),
                combo.getCreatedAt(),
                comboItems,
                comboOptionGroups
        );
    }
}
