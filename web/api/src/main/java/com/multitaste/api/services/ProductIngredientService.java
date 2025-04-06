package com.multitaste.api.services;

import com.multitaste.api.dto.request.ProductIngredientRequestDTO;
import com.multitaste.api.dto.response.ProductIngredientResponseDTO;

import java.util.List;

public interface ProductIngredientService {
    List<ProductIngredientResponseDTO> saveAll(List<ProductIngredientRequestDTO> dto);
}
