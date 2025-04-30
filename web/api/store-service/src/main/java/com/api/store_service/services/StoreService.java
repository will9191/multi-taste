package com.api.store_service.services;

import com.api.store_service.dto.request.StoreRequest;
import com.api.store_service.dto.response.StoreResponse;

import java.util.List;

public interface StoreService {
    StoreResponse save(StoreRequest store);
    List<StoreResponse> saveAll(List<StoreRequest> dtoList);
    List<StoreResponse> findAll();
    StoreResponse findById(Long id);
}
