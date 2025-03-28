package com.wpizza.api.domain.order;

import com.wpizza.api.domain.orderItem.OrderItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Order {
    public UUID id;
    public List<OrderItem> orderItems;
    public BigDecimal price;
}
