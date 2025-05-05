package com.api.product_service.strategies;

import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.entities.Product;
import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.services.ProductCustomizationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("single")
public class SingleProductCreationStrategy implements ProductCreationStrategy {
    private final ProductRepository repository;
    private final ProductCustomizationService productCustomizationService;

    public SingleProductCreationStrategy(ProductRepository repository, ProductCustomizationService productCustomizationService) {
        this.repository = repository;
        this.productCustomizationService = productCustomizationService;
    }

    @Override
    public Product create(ProductRequest request) {
        SingleProduct product = new SingleProduct();
        product.setName(request.name());
        product.setDescription(request.description());
        product.setImgUrl(request.imgUrl());
        product.setPrice(request.price());
        product.setDiscount(request.discount());

        List<Long> productCustomizationIdList = new ArrayList<>();

        for (ProductCustomizationRequest c : request.customizations()) {
            ProductCustomizationResponse productCustomization = productCustomizationService.save(c);
            productCustomizationIdList.add(productCustomization.id());
        }

        product.setProductCustomizationsIds(productCustomizationIdList);

        List<Long> categoriesIds = new ArrayList<>(request.categoriesIds());
        product.setCategoriesIds(categoriesIds);


        return repository.save(product);
    }
}
