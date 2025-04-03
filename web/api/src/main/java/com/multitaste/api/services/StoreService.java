package com.multitaste.api.services;

import com.multitaste.api.dto.request.StoreRequestDTO;
import com.multitaste.api.entities.Store;

import java.util.List;

public interface StoreService {
    Store save(StoreRequestDTO store);
    List<Store> findAll();
}
