package com.multitaste.api.services;

import com.multitaste.api.dto.request.IngredientRequestDTO;
import com.multitaste.api.dto.response.IngredientResponseDTO;
import com.multitaste.api.entities.Ingredient;
import com.multitaste.api.repositories.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository repository;


    @Override
    public IngredientResponseDTO save(IngredientRequestDTO dto) {

        Ingredient ingredient = new Ingredient();

        ingredient.setName(dto.name());
        ingredient.setImgUrl(dto.imgUrl());
        ingredient.setCommonAdditionalPrice(dto.commonAdditionalPrice());


        repository.save(ingredient);


        return new IngredientResponseDTO(ingredient.getId(), ingredient.getName(), ingredient.getImgUrl(), ingredient.getCommonAdditionalPrice());
    }

    @Override
    public List<IngredientResponseDTO> saveAll(List<IngredientRequestDTO> dtoList) {

        List<IngredientResponseDTO> responseDTOList = new ArrayList<>();
        for (IngredientRequestDTO dto : dtoList) {
            IngredientResponseDTO response = this.save(dto);
            responseDTOList.add(response);
        }

        return responseDTOList;
    }

    @Override
    public List<IngredientResponseDTO> findAll() {
        List<Ingredient> ingredients = repository.findAll();

        List<IngredientResponseDTO> response = new ArrayList<>();

        for (Ingredient ingredient : ingredients) {
            IngredientResponseDTO ingredientDTO = new IngredientResponseDTO(ingredient.getId(), ingredient.getName(), ingredient.getImgUrl(), ingredient.getCommonAdditionalPrice());
            response.add(ingredientDTO);
        }

        return response;

    }
}
