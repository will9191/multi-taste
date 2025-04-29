package com.api.product_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "_product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    @ElementCollection
    private List<Long> categoriesIds;
    @ElementCollection
    private List<Long> productCustomizationsIds = new ArrayList<>();
    private LocalDateTime createdAt;
    @PrePersist
    public void setCreatedAt(){
        this.setCreatedAt(LocalDateTime.now());
    }
}
