package com.api.order_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ElementCollection
    private List<Long> orderItemIds;
    private BigDecimal price;
    private Long userId;
    private Long addressId;
    private LocalDateTime createdAt;

    @PrePersist
    public void onPrePersist () {
        this.setCreatedAt(LocalDateTime.now());
    }
}
