package com.multitaste.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class ComboItem {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "combo_id", nullable = false)
    private Combo combo;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
