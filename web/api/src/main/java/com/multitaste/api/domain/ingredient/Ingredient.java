package com.multitaste.api.domain.ingredient;

import com.multitaste.api.utils.enums.IngredientMeasure;

import java.util.UUID;

public class Ingredient {
    private UUID id;
    private String name;
    private String imgUrl;
    private int quantity;
    private IngredientMeasure measure;

    public Ingredient(UUID id, String name, String imgUrl, int quantity, IngredientMeasure measure) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.quantity = quantity;
        this.measure = measure;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public IngredientMeasure getMeasure() {
        return measure;
    }

    public void setMeasure(IngredientMeasure measure) {
        this.measure = measure;
    }
}
