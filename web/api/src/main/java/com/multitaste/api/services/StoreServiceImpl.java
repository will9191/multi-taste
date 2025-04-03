package com.multitaste.api.services;

import com.multitaste.api.dto.request.StoreRequestDTO;
import com.multitaste.api.entities.Store;
import com.multitaste.api.repositories.StoreRepository;
import com.multitaste.api.utils.mappers.StoreMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository repository;
    private final StoreMapper mapper;

    @Override
    public Store save(StoreRequestDTO dto) {
        Store store = mapper.dtoToEntity(dto);

        return repository.save(store);
    }

    @Override
    public List<Store> findAll() {
        return repository.findAll();
    }
}
