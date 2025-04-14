package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreComboOption {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Store store;
    @ManyToOne
    private ComboOption comboOption;
}
