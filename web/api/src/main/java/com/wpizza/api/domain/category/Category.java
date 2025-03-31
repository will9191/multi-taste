package com.wpizza.api.domain.category;

import com.wpizza.api.domain.product.Product;

import java.util.List;
import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private String slug;
    private List<Product> products;

    public Category(UUID id, String name, String slug, List<Product> products) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.products = products;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
