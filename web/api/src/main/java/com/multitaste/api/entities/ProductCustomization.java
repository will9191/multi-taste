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
public class ProductCustomization {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private Customization customization;
    private boolean includedByDefault;
    private boolean quantityAdjustable;
    private int quantity;
    private int additionalQuantity;
    private BigDecimal additionalPrice;
    private int minQuantity;
    private int maxQuantity;
}
