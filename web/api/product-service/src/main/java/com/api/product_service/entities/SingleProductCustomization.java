package com.api.product_service.entities;

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
public class ProductCustomization {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "customization_id")
    private Long customizationId;
    private boolean includedByDefault;
    private boolean quantityAdjustable;
    private int quantity;
    private int additionalQuantity;
    private BigDecimal additionalPrice;
    private int minQuantity;
    private int maxQuantity;
}
