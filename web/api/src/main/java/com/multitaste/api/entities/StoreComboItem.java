package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class StoreComboItem {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Store store;
    @ManyToOne
    private ComboItem comboItem;
}
