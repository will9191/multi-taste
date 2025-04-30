package com.api.store_service.services;

import com.api.store_service.client.AddressClient;
import com.api.store_service.dto.request.StoreRequest;
import com.api.store_service.dto.response.AddressResponse;
import com.api.store_service.dto.response.StoreResponse;
import com.api.store_service.entities.Store;
import com.api.store_service.repositories.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository repository;
    private final AddressClient addressClient;

    @Override
    public StoreResponse save(StoreRequest dto) {
        Store store = new Store();

        store.setName(dto.name());

        ResponseEntity<AddressResponse> addressEntity = addressClient.saveAddress(dto.address());
        AddressResponse address = addressEntity.getBody();

        assert address != null;
        store.setAddressId(address.id());

        repository.save(store);

        return new StoreResponse(store.getId(), store.getName(), address, store.getCreatedAt());
    }

    @Override
    public List<StoreResponse> saveAll(List<StoreRequest> dtoList) {

        List<StoreResponse> stores = new ArrayList<>();

        for (StoreRequest dto : dtoList) {
            stores.add(save(dto));
        }

        return stores;
    }

    @Override
    public List<StoreResponse> findAll() {
        List<Store> stores = repository.findAll();

        List<StoreResponse> storeResponses = new ArrayList<>();

        for (Store store : stores) {
            ResponseEntity<AddressResponse> addressEntity = addressClient.getAddress(store.getAddressId());
            AddressResponse address = addressEntity.getBody();

            storeResponses.add(new StoreResponse(store.getId(), store.getName(), address, store.getCreatedAt()));
        }

        return storeResponses;
    }

    @Override
    public StoreResponse findById(Long id) {
        return null;
    }
}
