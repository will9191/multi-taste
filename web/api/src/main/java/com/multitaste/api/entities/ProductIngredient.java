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
public class ProductIngredient {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private Ingredient ingredient;
    private boolean hasIngredient;
    private boolean isQuantityAdjustable;
    private int quantity;
    private BigDecimal additionalPrice;
}
