package com.multitaste.api.services;

import com.multitaste.api.dto.request.ComboItemRequestDTO;
import com.multitaste.api.dto.request.ComboOptionGroupRequestDTO;
import com.multitaste.api.dto.request.ComboOptionRequestDTO;
import com.multitaste.api.dto.request.ComboRequestDTO;
import com.multitaste.api.entities.*;
import com.multitaste.api.repositories.ComboItemRepository;
import com.multitaste.api.repositories.ComboRepository;
import com.multitaste.api.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ComboServiceImpl implements ComboService {
    private final ComboRepository repository;
    private final ComboItemService comboItemService;
    private final ComboGroupService comboGroupService;
    private final ComboOptionGroupService comboOptionGroupService;
    private final ProductRepository productRepository;

    @Override
    public Combo save(ComboRequestDTO dto) {
        Combo combo = new Combo();

        combo.setName(dto.name());
        combo.setImgUrl(dto.imgUrl());
        combo.setPrice(dto.price());
        combo.setDiscount(dto.discount());

        List<ComboItem> comboItems = new ArrayList<>();

        for (ComboItemRequestDTO comboItemDTO : dto.comboItems()) {
            ComboItem comboItem = new ComboItem();
            Optional<Product> optionalProduct = productRepository.findById(comboItemDTO.productId());

            if (optionalProduct.isPresent()) {
                Product product = optionalProduct.get();
                comboItem.setProduct(product);
                comboItem.setCombo(combo);
                comboItems.add(comboItem);
            }
        }
        combo.setComboItems(comboItems);

        List<ComboOptionGroup> comboOptionGroups = new ArrayList<>();

        for (ComboOptionGroupRequestDTO comboOptionGroupDTO : dto.comboOptionGroups()) {
            ComboOptionGroup comboOptionGroup = new ComboOptionGroup();

            comboOptionGroup.setName(comboOptionGroupDTO.name());
            comboOptionGroup.setMinSelect(comboOptionGroupDTO.minSelect());
            comboOptionGroup.setMaxSelect(comboOptionGroupDTO.maxSelect());
            comboOptionGroup.setCombo(combo);

            List<ComboOption> comboOptions = new ArrayList<>();

            for (ComboOptionRequestDTO comboOptionDTO : comboOptionGroupDTO.comboOptions()) {
                Optional<Product> optionalProduct = productRepository.findById(comboOptionDTO.productId());

                if (optionalProduct.isPresent()) {
                    Product product = optionalProduct.get();
                    ComboOption comboOption = new ComboOption();
                    comboOption.setProduct(product);
                    comboOption.setGroup(comboOptionGroup);
                    comboOptions.add(comboOption);
                }
            }
            comboOptionGroup.setComboOptions(comboOptions);
            comboOptionGroups.add(comboOptionGroup);
        }

        combo.setComboOptionGroups(comboOptionGroups);


        return repository.save(combo);
    }

    @Override
    public List<Combo> findAll() {
        return repository.findAll();
    }
}
