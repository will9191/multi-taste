package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;
    @ManyToMany
    private List<Ingredient> ingredients;
    private int volume;
    private LocalDateTime createdAt;

    @PrePersist
    public void setCreatedAt(){
        this.setCreatedAt(LocalDateTime.now());
    }
}
