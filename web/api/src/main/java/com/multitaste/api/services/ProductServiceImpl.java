package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductIngredientRequestDTO;
import com.multitaste.api.dto.request.ProductRequestDTO;
import com.multitaste.api.entities.Category;
import com.multitaste.api.entities.Ingredient;
import com.multitaste.api.entities.Product;
import com.multitaste.api.entities.ProductIngredient;
import com.multitaste.api.repositories.CategoryRepository;
import com.multitaste.api.repositories.IngredientRepository;
import com.multitaste.api.repositories.ProductIngredientRepository;
import com.multitaste.api.repositories.ProductRepository;
import com.multitaste.api.utils.specifications.ProductSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductIngredientRepository productIngredientRepository;
    private final IngredientRepository ingredientRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Product save(ProductRequestDTO dto) {

        Product product = new Product();
        product.setName(dto.name());
        product.setImgUrl(dto.imgUrl());
        product.setCommonPrice(dto.commonPrice());

        List<Category> categories = new ArrayList<>();

        for (UUID id: dto.categoriesIds()) {
            Optional<Category> optionalCategory = categoryRepository.findById(id);

            if (optionalCategory.isPresent()){
                Category category = optionalCategory.get();
                categories.add(category);
            }
        }

        product.setCategories(categories);


        List<ProductIngredient> productIngredientsList = new ArrayList<>();

        for (ProductIngredientRequestDTO i: dto.ingredients()) {
            Optional<Ingredient> optionalIngredient = ingredientRepository.findById(i.ingredientId());

            if (optionalIngredient.isPresent()){
                Ingredient ingredient = optionalIngredient.get();
                ProductIngredient productIngredient = new ProductIngredient();
                productIngredient.setIngredient(ingredient);
                productIngredient.setHasIngredient(i.hasIngredient());
                productIngredient.setAdditionalPrice(i.additionalPrice());
                productIngredient.setQuantityAdjustable(i.isQuantityAdjustable());
                productIngredient.setQuantity(i.quantity());

                productIngredientsList.add(productIngredient);
            } else {
                return null;
            }
        }

        productIngredientRepository.saveAll(productIngredientsList);

        product.setIngredients(productIngredientsList);

        return repository.save(product);
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
