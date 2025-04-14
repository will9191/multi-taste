package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreProductCustomization {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private StoreProduct storeProduct;
    @ManyToOne
    private ProductCustomization productCustomization;
    private boolean includedByDefault;
    private boolean quantityAdjustable;
    private int quantity;
    private int additionalQuantity;
    private int additionalPrice;
    private int minQuantity;
    private int maxQuantity;

}
