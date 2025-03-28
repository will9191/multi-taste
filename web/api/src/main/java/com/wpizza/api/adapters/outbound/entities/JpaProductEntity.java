package com.wpizza.api.adapters.outbound.entities;

import com.wpizza.api.adapters.outbound.repositories.JpaProductRepository;
import com.wpizza.api.domain.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "product")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JpaProductEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String imgUrl;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;

    public JpaProductEntity(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.imgUrl = product.getImgUrl();
        this.price = product.getPrice();
        this.discount= product.getDiscount();
        this. discountPrice = product.getDiscountPrice();
    }
}
