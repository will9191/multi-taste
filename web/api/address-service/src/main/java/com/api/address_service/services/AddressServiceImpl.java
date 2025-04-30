package com.api.address_service.services;

import com.api.address_service.dto.request.AddressRequest;
import com.api.address_service.dto.response.AddressResponse;
import com.api.address_service.entities.Address;
import com.api.address_service.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;

    @Override
    public AddressResponse addAddress(AddressRequest dto) {
        Address address = Address.builder()
                .street(dto.street())
                .neighborhood(dto.neighborhood())
                .number(dto.number())
                .city(dto.city())
                .state(dto.state())
                .country(dto.country())
                .complement(dto.complement())
                .residence(dto.residence())
                .latitude(dto.latitude())
                .longitude(dto.longitude())
                .build();

        repository.save(address);

        return new AddressResponse(
                address.getId(),
                address.getStreet(),
                address.getNeighborhood(),
                address.getNumber(),
                address.getCity(),
                address.getState(),
                address.getCountry(),
                address.getComplement(),
                address.getResidence(),
                address.getLatitude(),
                address.getLongitude());
    }

    @Override
    public AddressResponse getAddressById(Long id) {
        Address address = repository.findById(id).orElse(null);
        return new AddressResponse(
                address.getId(),
                address.getStreet(),
                address.getNeighborhood(),
                address.getNumber(),
                address.getCity(),
                address.getState(),
                address.getCountry(),
                address.getComplement(),
                address.getResidence(),
                address.getLatitude(),
                address.getLongitude());
    }
}
