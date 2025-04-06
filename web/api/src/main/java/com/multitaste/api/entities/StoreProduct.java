package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreProduct {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Store store;
    private BigDecimal price;
    private BigDecimal discount;
}
