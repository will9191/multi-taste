package com.api.product_service.strategies.get;

import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.dto.response.SingleProductResponse;
import com.api.product_service.entities.Product;
import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.services.ProductCustomizationService;
import com.api.product_service.services.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SingleProductRetrievalStrategy implements ProductRetrievalStrategy<SingleProductResponse> {
    private final ProductRepository productRepository;
    private final ProductCustomizationService productCustomizationService;

    @Override
    public List<SingleProductResponse> getProducts() {

        List<SingleProductResponse> products = new ArrayList<>();

        List<Product> productList = productRepository.findAll();
        for (Product product : productList) {
            products.add(getProduct(product.getId()));
        }

        return products;
    }

    @Override
    public SingleProductResponse getProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        if (!(product instanceof SingleProduct singleProduct)) {
            throw new IllegalArgumentException("Product is not a Single product");
        }

        List<ProductCustomizationResponse> customizations = new ArrayList<>();

        for (Long pcId : singleProduct.getProductCustomizationsIds()) {
            customizations.add(productCustomizationService.findById(pcId));
        }

        return new SingleProductResponse(
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
    }
}
