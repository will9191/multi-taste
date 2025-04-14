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
    @ManyToMany
    private List<Category> categories;
    @OneToMany
    private List<ProductCustomization> customizations = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name = "product_nutritional_info", joinColumns = @JoinColumn(name = "product_id"))
    private List<NutritionalInformation> nutritionalInformation;
    private LocalDateTime createdAt;
    @PrePersist
    public void setCreatedAt(){
        this.setCreatedAt(LocalDateTime.now());
    }
}
