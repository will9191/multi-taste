package com.multitaste.api.adapters.outbound.entities;

import com.multitaste.api.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Table(name = "product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class JpaProductEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;
    @ManyToMany
    private List<JpaIngredientEntity> ingredients;
    private int volume;

    public JpaProductEntity(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.imgUrl = product.getImgUrl();
        this.price = product.getPrice();
        this.discount= product.getDiscount();
        this.discountPrice = product.getDiscountPrice();
        this.ingredients = product.getIngredients().stream().map(JpaIngredientEntity::new).collect(Collectors.toList());
        this.volume = product.getVolume();
    }
}
