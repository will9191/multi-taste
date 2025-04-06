package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.IngredientRequestDTO;
import com.multitaste.api.dto.response.IngredientResponseDTO;
import com.multitaste.api.entities.Ingredient;
import com.multitaste.api.services.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
@RequiredArgsConstructor
public class IngredientController {
    private final IngredientService service;

    @PostMapping
    public IngredientResponseDTO save(@RequestBody IngredientRequestDTO dto) {
        return service.save(dto);
    }

    @PostMapping("/all")
    public List<IngredientResponseDTO> saveAll(@RequestBody List<IngredientRequestDTO> dtoList) {
        return service.saveAll(dtoList);
    }

    @GetMapping
    public List<IngredientResponseDTO> findAll() {
        return service.findAll();
    }

}
