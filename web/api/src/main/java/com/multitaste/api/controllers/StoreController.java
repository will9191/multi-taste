package com.multitaste.api.controllers;

import com.multitaste.api.dto.request.StoreRequestDTO;
import com.multitaste.api.entities.Store;
import com.multitaste.api.services.StoreService;
import com.multitaste.api.services.StoreServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService service;

    @PostMapping
    public void save(StoreRequestDTO dto) {
        this.service.save(dto);
    }

    @GetMapping
    public List<Store> findAll(){
        return this.service.findAll();
    }
}
