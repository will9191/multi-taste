package com.multitaste.api.domain.orderStatus;

import com.multitaste.api.utils.enums.OrderStatusEnum;

import java.util.UUID;

public class OrderStatus {
    private UUID id;
    private UUID orderId;
    private OrderStatusEnum orderStatusEnum;
}
