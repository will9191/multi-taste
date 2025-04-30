package com.api.store_service.client;

import com.api.store_service.dto.request.AddressRequest;
import com.api.store_service.dto.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "address-service")
public interface AddressClient {
    @PostMapping("/address")
    ResponseEntity<AddressResponse> saveAddress(@RequestBody AddressRequest dto);

    @GetMapping("/address/{id}")
    ResponseEntity<AddressResponse> getAddress(@PathVariable("id") Long id);
}
