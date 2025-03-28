package com.wpizza.api.domain.product;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;
}
