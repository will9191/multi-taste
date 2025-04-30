package com.api.address_service.controllers;

import com.api.address_service.dto.request.AddressRequest;
import com.api.address_service.dto.response.AddressResponse;
import com.api.address_service.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService service;

    @PostMapping
    public AddressResponse createAddress(@RequestBody AddressRequest address) {
        return service.addAddress(address);
    }

    @GetMapping("/{id}")
    public AddressResponse getAddress(@PathVariable("id") Long id) {
        return service.getAddressById(id);
    }
}
