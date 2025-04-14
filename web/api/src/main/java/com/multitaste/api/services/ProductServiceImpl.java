package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductCustomizationRequestDTO;
import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.*;
import com.multitaste.api.repositories.*;
import com.multitaste.api.utils.specifications.ProductSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCustomizationRepository productCustomizationRepository;
    private final CustomizationRepository customizationRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product save(ProductRequestDTO dto) {

        Product product = new Product();
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setImgUrl(dto.imgUrl());
        product.setPrice(dto.price());
        product.setDiscount(dto.discount());

        List<ProductCustomization> productCustomizationList = new ArrayList<>();

        for (ProductCustomizationRequestDTO c : dto.customizations()) {
            Optional<Customization> optionalCustomization = customizationRepository.findById(c.customizationId());

            if (optionalCustomization.isPresent()) {
                Customization customization = optionalCustomization.get();
                ProductCustomization productCustomization = new ProductCustomization();
                productCustomization.setCustomization(customization);
                productCustomization.setIncludedByDefault(c.includedByDefault());
                productCustomization.setQuantityAdjustable(c.quantityAdjustable());
                productCustomization.setQuantity(c.quantity());
                productCustomization.setAdditionalQuantity(c.additionalQuantity());
                productCustomization.setAdditionalPrice(c.additionalPrice());
                productCustomization.setMinQuantity(c.minQuantity());
                productCustomization.setMaxQuantity(c.maxQuantity());

                productCustomizationList.add(productCustomization);
            } else {
                return null;
            }
        }
        productCustomizationRepository.saveAll(productCustomizationList);

        List<Category> categories = new ArrayList<>();
        for (Long id: dto.categoriesIds()){
            Optional<Category>optionalCategory = categoryRepository.findById(id);

            if (optionalCategory.isPresent()){
                Category category = optionalCategory.get();
                categories.add(category);
            }
        }
        product.setCategories(categories);

        product.setCustomizations(productCustomizationList);
        product.setNutritionalInformation(dto.nutritionalInformation());

        return repository.save(product);
    }

    @Override
    public List<Product> saveAll(List<ProductRequestDTO> dtoList) {
        List<Product> products = new ArrayList<>();

        for(ProductRequestDTO dto: dtoList){
          Product product = save(dto);
          products.add(product);
        }

        return products;
    }


    @Override
    public Page<Product> getProducts(String name, String category, int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Specification<Product> spec = ProductSpecification.createDynamicSpecification(name, category);

        return repository.findAll(spec, pageable);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }


}
