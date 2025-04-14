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
    private Long id;
    @ManyToOne
    private Store store;
    @ManyToOne
    private Product product;
    private BigDecimal price;
    private BigDecimal discount;
}
