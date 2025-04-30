package com.api.order_service.services;

import com.api.order_service.dto.request.OrderRequest;
import com.api.order_service.dto.response.OrderResponse;

public interface OrderService {
    OrderResponse save(OrderRequest dto);
}
