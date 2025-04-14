package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class ComboOption {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private ComboOptionGroup group;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false )
    private Product product;
}
