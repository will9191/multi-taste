package com.wpizza.api.domain.orderItem;

import com.wpizza.api.domain.product.Product;

import java.util.List;
import java.util.UUID;

public class OrderItem {
    private UUID id;
    private Product product;
    private int quantity;
}
