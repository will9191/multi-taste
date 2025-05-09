package com.api.store_service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class StoreProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long storeId;
    private Long productId;
    private BigDecimal price;
    private BigDecimal discount;
    @ManyToMany
    private List<StoreCategory> category = new ArrayList<>();
    private LocalDateTime createdAt;

    @PrePersist
    public void setCreatedAt() {
        this.setCreatedAt(LocalDateTime.now());
    }
}
