package com.api.order_service.controllers;

import com.api.order_service.dto.request.OrderRequest;
import com.api.order_service.dto.response.OrderResponse;
import com.api.order_service.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest dto){
        return service.save(dto);
    }
}
