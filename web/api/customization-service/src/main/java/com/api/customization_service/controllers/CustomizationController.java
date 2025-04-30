package com.api.customization_service.controllers;

import com.api.customization_service.dto.request.CustomizationRequestDTO;
import com.api.customization_service.dto.response.CustomizationResponseDTO;
import com.api.customization_service.services.CustomizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customization")
@RequiredArgsConstructor
public class CustomizationController {
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

    @GetMapping("/{id}")
    public CustomizationResponseDTO findById(@PathVariable("id") Long id){
        return service.findById(id);
    }
}
