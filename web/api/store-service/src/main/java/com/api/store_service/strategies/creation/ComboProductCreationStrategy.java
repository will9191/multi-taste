package com.api.product_service.strategies.creation;

import com.api.product_service.dto.request.ComboItemRequest;
import com.api.product_service.dto.request.ComboOptionGroupRequest;
import com.api.product_service.dto.request.ComboOptionRequest;
import com.api.product_service.dto.request.ComboProductRequest;
import com.api.product_service.entities.*;
import com.api.product_service.repositories.ProductRepository;
import com.api.product_service.repositories.SingleProductRepository;
import com.api.product_service.services.ComboItemService;
import com.api.product_service.services.ComboOptionGroupService;
import com.api.product_service.services.ComboOptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComboProductCreationStrategy implements ProductCreationStrategy<ComboProductRequest> {
    private final ProductRepository repository;
    private final ComboItemService comboItemService;
    private final ComboOptionGroupService comboOptionGroupService;

    @Override
    public Product create(ComboProductRequest request) {
        Combo combo = new Combo();

        combo.setName(request.getName());
        combo.setDescription(request.getDescription());
        combo.setImgUrl(request.getImgUrl());
        combo.setPrice(request.getPrice());
        combo.setDiscount(request.getDiscount());
        combo.setType(request.getType());
        combo.setCategoriesIds(request.getCategoriesIds());

        List<ComboItem> comboItems = new ArrayList<>();

        for (ComboItemRequest comboItemRequest: request.getComboItems()) {
            comboItems.add(comboItemService.save(comboItemRequest));
        }

        combo.setComboItems(comboItems);

        List<ComboOptionGroup> comboOptionGroups = new ArrayList<>();

        for (ComboOptionGroupRequest comboOptionGroupRequest: request.getComboOptionGroups()) {
            comboOptionGroups.add(comboOptionGroupService.save(comboOptionGroupRequest));
        }

        combo.setComboOptionGroups(comboOptionGroups);

        return repository.save(combo);
    }


}
