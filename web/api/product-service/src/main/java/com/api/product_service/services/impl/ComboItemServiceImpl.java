package com.api.product_service.services;

import com.api.product_service.dto.request.ComboItemRequest;
import com.api.product_service.entities.Combo;
import com.api.product_service.entities.ComboItem;
import com.api.product_service.entities.Product;
import com.api.product_service.entities.SingleProduct;
import com.api.product_service.repositories.ComboItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ComboItemServiceImpl implements ComboItemService {
    private final ComboItemRepository repository;
    private final SingleProductService singleProductService;

    @Override
    public ComboItem save(ComboItemRequest dto) {
        ComboItem comboItem = new ComboItem();
        SingleProduct singleProduct = singleProductService.findById(dto.productId());

        comboItem.setSingleProduct(singleProduct);
        return repository.save(comboItem);
    }
}
