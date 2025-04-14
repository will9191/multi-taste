package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.CustomizationRequestDTO;
import com.multitaste.api.dto.response.CustomizationResponseDTO;
import com.multitaste.api.services.CustomizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
@RequiredArgsConstructor
public class IngredientController {
    private final CustomizationService service;

    @PostMapping
    public CustomizationResponseDTO save(@RequestBody CustomizationRequestDTO dto) {
        return service.save(dto);
    }

    @PostMapping("/all")
    public List<CustomizationResponseDTO> saveAll(@RequestBody List<CustomizationRequestDTO> dtoList) {
        return service.saveAll(dtoList);
    }

    @GetMapping
    public List<CustomizationResponseDTO> findAll() {
        return service.findAll();
    }

}
