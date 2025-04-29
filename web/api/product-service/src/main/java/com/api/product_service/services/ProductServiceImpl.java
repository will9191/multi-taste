package com.api.product_service.services;

import com.api.product_service.dto.request.ProductCustomizationRequestDTO;
import com.api.product_service.dto.request.ProductRequestDTO;
import com.api.product_service.dto.response.CategoryResponse;
import com.api.product_service.dto.response.CustomizationResponseDTO;
import com.api.product_service.dto.response.ProductCustomizationResponseDTO;
import com.api.product_service.dto.response.ProductResponseDTO;
import com.api.product_service.entities.Product;
import com.api.product_service.entities.ProductCustomization;
import com.api.product_service.repositories.ProductCustomizationRepository;
import com.api.product_service.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCustomizationService productCustomizationService;
    private WebClient webClient;


    @Override
    public Product save(ProductRequestDTO dto) {

        Product product = new Product();
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setImgUrl(dto.imgUrl());
        product.setPrice(dto.price());
        product.setDiscount(dto.discount());

        List<Long> productCustomizationIdList = new ArrayList<>();

        for (ProductCustomizationRequestDTO c : dto.customizations()) {
            ProductCustomizationResponseDTO productCustomizationDTO = productCustomizationService.save(c);
            productCustomizationIdList.add(productCustomizationDTO.id());
        }

        product.setProductCustomizationsIds(productCustomizationIdList);

        List<Long> categoriesIds = new ArrayList<>(dto.categoriesIds());
        product.setCategoriesIds(categoriesIds);

        return repository.save(product);
    }

    @Override
    public List<Product> saveAll(List<ProductRequestDTO> dtoList) {
        List<Product> products = new ArrayList<>();

        for (ProductRequestDTO dto : dtoList) {
            Product product = save(dto);
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
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductResponseDTO findById(Long id) {
        Product product = repository.findById(id).orElseThrow();

        List<ProductCustomizationResponseDTO> productCustomizations = new ArrayList<>();

        for (Long productCustomizationId:product.getProductCustomizationsIds()){
            productCustomizations.add(productCustomizationService.findById(productCustomizationId));
        }

        List<CategoryResponse> categories = new ArrayList<>();

        for (Long categoryId : product.getCategoriesIds()){
            CategoryResponse category = webClient
                    .get()
                    .uri("http://localhost:8080/category/" + categoryId)
                    .retrieve()
                    .bodyToMono(CategoryResponse.class)
                    .block();

            categories.add(category);
        }

        ProductResponseDTO productResponse = new ProductResponseDTO(
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
