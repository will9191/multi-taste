package com.multitaste.api.services;

import com.multitaste.api.dto.request.AddressRequestDTO;
import com.multitaste.api.entities.Address;

public interface AddressService {
    Address save(AddressRequestDTO dto);
}
