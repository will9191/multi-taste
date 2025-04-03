package com.multitaste.api.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id;
    private List<OrderItem> items;
    private BigDecimal price;
    private LocalDateTime createdAt;

}
