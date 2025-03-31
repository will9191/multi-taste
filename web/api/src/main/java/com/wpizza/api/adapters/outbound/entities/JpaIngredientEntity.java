package com.wpizza.api.adapters.outbound.entities;

import com.wpizza.api.domain.ingredient.Ingredient;
import com.wpizza.api.utils.enums.IngredientMeasure;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JpaIngredientEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private int quantity;
    private IngredientMeasure measure;

    public JpaIngredientEntity(Ingredient ingredient) {
        this.id = ingredient.getId();
        this.name = ingredient.getName();
        this.imgUrl = ingredient.getImgUrl();
        this.quantity = ingredient.getQuantity();
        this.measure = ingredient.getMeasure();
    }
}
