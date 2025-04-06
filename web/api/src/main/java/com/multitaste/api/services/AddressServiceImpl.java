package com.multitaste.api.services;

import com.multitaste.api.dto.request.AddressRequestDTO;
import com.multitaste.api.entities.Address;
import com.multitaste.api.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AddressServiceImpl implements AddressService{
    private final AddressRepository repository;


    @Override
    public Address save(AddressRequestDTO dto) {
        Address address = new Address();
        address.setStreet(dto.street());
        address.setNeighborhood(dto.neighborhood());
        address.setNumber(dto.number());
        address.setCity(dto.city());
        address.setState(dto.state());
        address.setCountry(dto.country());
        address.setComplement(dto.complement());
        address.setResidence(dto.residence());
        address.setLongitude(dto.longitude());
        address.setLatitude(dto.latitude());

        return repository.save(address);
    }
}
