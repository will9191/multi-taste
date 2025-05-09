package com.api.product_service.strategies.creation;

import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.request.SingleProductRequest;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.entities.Product;
import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.services.ProductCustomizationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SingleProductCreationStrategy implements ProductCreationStrategy<SingleProductRequest> {
    private final ProductRepository repository;
    private final ProductCustomizationService productCustomizationService;

    public SingleProductCreationStrategy(ProductRepository repository, ProductCustomizationService productCustomizationService) {
        this.repository = repository;
        this.productCustomizationService = productCustomizationService;
    }

    @Override
    public Product create(SingleProductRequest request) {
        SingleProduct product = new SingleProduct();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setImgUrl(request.getImgUrl());
        product.setPrice(request.getPrice());
        product.setDiscount(request.getDiscount());
        product.setType(request.getType());

        List<Long> productCustomizationIdList = new ArrayList<>();

        for (ProductCustomizationRequest c : request.getCustomizations()) {
            ProductCustomizationResponse productCustomization = productCustomizationService.save(c);
            productCustomizationIdList.add(productCustomization.id());
        }

        product.setProductCustomizationsIds(productCustomizationIdList);
        product.setCategoriesIds(request.getCategoriesIds());

        return repository.save(product);
    }
}
