package com.api.product_service.services;

import com.api.product_service.dto.request.ComboOptionGroupRequest;
import com.api.product_service.dto.request.ComboOptionRequest;
import com.api.product_service.entities.Combo;
import com.api.product_service.entities.ComboOption;
import com.api.product_service.entities.ComboOptionGroup;
import com.api.product_service.repositories.ComboOptionGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComboOptionGroupServiceImpl implements ComboOptionGroupService {
    private final ComboOptionGroupRepository repository;
    private final ComboOptionService comboOptionService;


    @Override
    public ComboOptionGroup save(ComboOptionGroupRequest request) {
        ComboOptionGroup comboOptionGroup = new ComboOptionGroup();

        comboOptionGroup.setName(request.name());
        comboOptionGroup.setMinSelect(request.minSelect());
        comboOptionGroup.setMaxSelect(request.maxSelect());

        List<ComboOption> comboOptions = new ArrayList<>();

        for (ComboOptionRequest comboOptionRequest: request.comboOptions()) {
            comboOptions.add(comboOptionService.save(comboOptionRequest));
        }

        comboOptionGroup.setComboOptions(comboOptions);
        return repository.save(comboOptionGroup);
    }
}
