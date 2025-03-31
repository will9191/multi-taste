package com.wpizza.api.adapters.outbound.entities;

import com.wpizza.api.domain.category.Category;
import com.wpizza.api.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JpaCategoryEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String slug;
    @OneToMany
    private List<JpaProductEntity> products;

    public JpaCategoryEntity(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.slug = category.getSlug();
        this.products = category.getProducts().stream().map(JpaProductEntity::new).collect(Collectors.toList());
    }
}
