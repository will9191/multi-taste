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
public class StoreProductIngredient {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private StoreProduct storeProduct;
    @ManyToOne
    private ProductIngredient productIngredient;
    private int quantity;
    private int additionalQuantity;
    private int additionalPrice;
    private int maxQuantity;
    private int minQuantity;
}
