package com.api.order_service.services;

import com.api.order_service.dto.request.OrderRequest;
import com.api.order_service.dto.response.OrderResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponse save(OrderRequest dto) {
        return null;
    }
}
