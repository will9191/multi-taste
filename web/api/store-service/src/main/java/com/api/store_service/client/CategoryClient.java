package com.api.store_service.client;

import com.api.store_service.dto.response.CategoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "category-service")
public interface CategoryClient {
    @GetMapping("/category/{id}")
    ResponseEntity<CategoryResponse> getCategoryById(@PathVariable("id") Long id);
}
