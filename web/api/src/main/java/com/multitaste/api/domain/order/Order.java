package com.multitaste.api.domain.order;

import com.multitaste.api.domain.orderItem.OrderItem;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private List<OrderItem> items;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private OrderType type;

}
