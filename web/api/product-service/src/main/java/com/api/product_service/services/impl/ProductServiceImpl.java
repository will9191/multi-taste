package com.api.product_service.services;

import com.api.product_service.client.CategoryClient;
import com.api.product_service.dto.response.CategoryResponse;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.entities.Product;
import com.api.product_service.factories.ProductCreationStrategyFactory;
import com.api.product_service.factories.ProductRetrievalStrategyFactory;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.strategies.get.ProductRetrievalStrategy;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCreationStrategyFactory creationStrategyFactory;
    private final ProductRetrievalStrategyFactory retrievalStrategyFactory;
    private final CategoryClient categoryClient;

    @Override
    public Product save(ProductRequest request) {
        return creationStrategyFactory.resolve(request.getType()).create(request);
    }

    @Override
    public List<Product> saveAll(List<ProductRequest> dtoList) {
        List<Product> products = new ArrayList<>();

        for (ProductRequest dto : dtoList) {
            Product product = save(dto);
            products.add(product);
        }

        return products;
    }

    @Override
    public List<ProductResponse> findByCategory(String slug) {
        List<ProductResponse> products = new ArrayList<>();

        ResponseEntity<CategoryResponse> categoryEntity = categoryClient.getCategoryBySlug(slug);
        CategoryResponse category = categoryEntity.getBody();

        List<Product> productList = repository.findAllByCategoryId(category.id());

        for (Product product : productList) {
            ProductRetrievalStrategy strategy = retrievalStrategyFactory.resolve(product.getType());
            products.add(strategy.getProduct(product.getId()));
        }

        return products;
    }


    @Override
    public List<ProductResponse> findAll() {
        List<Product> productsEntity = repository.findAll();

        List<ProductResponse> products = new ArrayList<>();

        for (Product product : productsEntity) {
            ProductRetrievalStrategy strategy = retrievalStrategyFactory.resolve(product.getType());
            products.add(strategy.getProduct(product.getId()));
        }

        return products;
    }

    @Override
    public ProductResponse findById(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found"));
        ProductRetrievalStrategy strategy = retrievalStrategyFactory.resolve(product.getType());

        return strategy.getProduct(id);
    }

}
