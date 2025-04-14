package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.ComboRequestDTO;
import com.multitaste.api.entities.Combo;
import com.multitaste.api.services.ComboService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combo")
@AllArgsConstructor
public class ComboController {
    private final ComboService service;

    @PostMapping
    public Combo save(@RequestBody ComboRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<Combo> findAll() {
        return service.findAll();
    }
}
