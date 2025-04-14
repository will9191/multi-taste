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
public class StoreComboOptionGroup {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private ComboOptionGroup comboOptionGroup;
    private String name;
    private int minSelect;
    private int maxSelect;
}
