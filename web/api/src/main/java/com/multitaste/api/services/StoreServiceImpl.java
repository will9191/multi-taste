package com.multitaste.api.services;

import com.multitaste.api.dto.request.StoreRequestDTO;
import com.multitaste.api.entities.Address;
import com.multitaste.api.entities.Store;
import com.multitaste.api.repositories.StoreRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository repository;
    private final AddressService addressService;

    @Override
    public Store save(StoreRequestDTO dto) {
        Store store = new Store();

        store.setName(dto.name());

        Address address = addressService.save(dto.address());

        store.setAddress(address);

        return repository.save(store);
    }

    @Override
    public List<Store> findAll() {
        return repository.findAll();
    }
}
