package com.multitaste.api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreCombo {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Store store;
    @ManyToOne
    private Combo combo;
    private BigDecimal price;
}
