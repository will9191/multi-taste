package com.multitaste.api.domain.orderItem;

import com.multitaste.api.domain.product.Product;

import java.util.UUID;

public class OrderItem {
    private UUID id;
    private Product product;
    private int quantity;
}
