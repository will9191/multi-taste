package com.api.address_service.services;

import com.api.address_service.dto.request.AddressRequest;
import com.api.address_service.dto.response.AddressResponse;

public interface AddressService {
    public AddressResponse addAddress(AddressRequest dto);
    public AddressResponse getAddressById(Long id);
}
