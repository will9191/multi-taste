package com.api.product_service.client;

import com.api.product_service.dto.response.CustomizationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "customization-service")
public interface CustomizationClient {
    @GetMapping("/customization/{id}")
    public ResponseEntity<CustomizationResponse> getCustomizationById(@PathVariable("id") Long id);
}
