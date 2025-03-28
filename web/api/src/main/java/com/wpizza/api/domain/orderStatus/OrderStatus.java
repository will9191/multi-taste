package com.wpizza.api.domain.orderStatus;

import com.wpizza.api.utils.enums.OrderStatusEnum;

import java.util.UUID;

public class OrderStatus {
    private UUID id;
    private UUID orderId;
    private OrderStatusEnum orderStatusEnum;
}
