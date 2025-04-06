package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal commonPrice;
    @OneToMany
    private List<ProductIngredient> ingredients = new ArrayList<>();
    @ManyToMany
    private List<Category> categories;
    private LocalDateTime createdAt;

    @PrePersist
    public void setCreatedAt(){
        this.setCreatedAt(LocalDateTime.now());
    }
}
