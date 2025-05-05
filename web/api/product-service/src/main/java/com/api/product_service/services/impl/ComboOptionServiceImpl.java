package com.api.product_service.services;

import com.api.product_service.dto.request.ComboOptionRequest;
import com.api.product_service.entities.ComboOption;
import com.api.product_service.entities.ComboOptionGroup;
import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.ComboOptionRepository;
import com.api.product_service.repositories.SingleProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComboOptionServiceImpl implements ComboOptionService {
    private final ComboOptionRepository repository;
    private final SingleProductRepository singleProductRepository;

    @Override
    public ComboOption save(ComboOptionRequest request) {
        SingleProduct singleProduct = singleProductRepository.findById(request.productId()).orElse(null);
        ComboOption comboOption = new ComboOption();
        comboOption.setSingleProduct(singleProduct);
        return repository.save(comboOption);
    }
}
