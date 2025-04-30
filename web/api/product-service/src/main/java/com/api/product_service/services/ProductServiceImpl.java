package com.api.product_service.services;

import com.api.product_service.client.CustomizationClient;
import com.api.product_service.dto.request.ProductCustomizationRequest;
import com.api.product_service.dto.response.CategoryResponse;
import com.api.product_service.dto.response.ProductCustomizationResponse;
import com.api.product_service.dto.response.ProductResponse;
import com.api.product_service.dto.request.ProductRequest;
import com.api.product_service.entities.Product;
import com.api.product_service.repositories.ProductCustomizationRepository;
import com.api.product_service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCustomizationService productCustomizationService;

    @Override
    public ProductResponse save(ProductRequest dto) {

        Product product = new Product();
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setImgUrl(dto.imgUrl());
        product.setPrice(dto.price());
        product.setDiscount(dto.discount());

        List<Long> productCustomizationIdList = new ArrayList<>();
        List<ProductCustomizationResponse> productCustomizationResponseList = new ArrayList<>();

        for (ProductCustomizationRequest c : dto.customizations()) {
            ProductCustomizationResponse productCustomization = productCustomizationService.save(c);
            productCustomizationIdList.add(productCustomization.id());
            productCustomizationResponseList.add(productCustomization);
        }

        product.setProductCustomizationsIds(productCustomizationIdList);

        List<Long> categoriesIds = new ArrayList<>(dto.categoriesIds());
        product.setCategoriesIds(categoriesIds);


        repository.save(product);

        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getImgUrl(), product.getCategoriesIds(), product.getPrice(), product.getDiscount(), productCustomizationResponseList);
    }

    @Override
    public List<ProductResponse> saveAll(List<ProductRequest> dtoList) {
        List<ProductResponse> products = new ArrayList<>();

        for (ProductRequest dto : dtoList) {
            ProductResponse product = save(dto);
            products.add(product);
        }

        return products;
    }


//    @Override
//    public Page<Product> getProducts(String name, String category, int pageNo, int pageSize) {
//        Pageable pageable = PageRequest.of(pageNo, pageSize);
//        Specification<Product> spec = ProductSpecification.createDynamicSpecification(name, category);
//
//        return repository.findAll(spec, pageable);
//    }

    @Override
    public List<ProductResponse> findAll() {

        List<ProductResponse> products = new ArrayList<>();

        for (Product product : repository.findAll()) {
            List<ProductCustomizationResponse> productCustomizationResponseList = new ArrayList<>();

            for (Long id : product.getProductCustomizationsIds()) {
                ProductCustomizationResponse productCustomization = productCustomizationService.findById(id);
                productCustomizationResponseList.add(productCustomization);
            }

            ProductResponse productResponse = new ProductResponse(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getImgUrl(),
                    product.getCategoriesIds(),
                    product.getPrice(),
                    product.getDiscount(),
                    productCustomizationResponseList
            );

            products.add(productResponse);
        }

        return products;
    }

    @Override
    public ProductResponse findById(Long id) {
        Product product = repository.findById(id).orElseThrow();

        List<ProductCustomizationResponse> productCustomizations = new ArrayList<>();

        for (Long productCustomizationId : product.getProductCustomizationsIds()) {
            productCustomizations.add(productCustomizationService.findById(productCustomizationId));
        }

        List<Long> categories = new ArrayList<>();

        for (Long categoryId : product.getCategoriesIds()) {
            categories.add(categoryId);
        }

        ProductResponse productResponse = new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getImgUrl(),
                categories,
                product.getPrice(),
                product.getDiscount(),
                productCustomizations
        );

        return productResponse;
    }

}
