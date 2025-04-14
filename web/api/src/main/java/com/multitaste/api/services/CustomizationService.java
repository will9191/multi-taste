package com.multitaste.api.services;

import com.multitaste.api.dto.request.IngredientRequestDTO;
import com.multitaste.api.dto.response.IngredientResponseDTO;
import com.multitaste.api.entities.Ingredient;

import java.util.List;

public interface IngredientService {
    IngredientResponseDTO save(IngredientRequestDTO dto);

    List<IngredientResponseDTO> saveAll(List<IngredientRequestDTO> dtoList);
    List<IngredientResponseDTO> findAll();
}
