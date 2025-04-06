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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class ProductBase {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;
    @OneToMany
    private List<ProductIngredient> ingredients = new ArrayList<>();
    @ManyToMany
    private List<Category> categories;
    private int volume;
    private LocalDateTime createdAt;

    @PrePersist
    public void setCreatedAt(){
        this.setCreatedAt(LocalDateTime.now());
    }
}
