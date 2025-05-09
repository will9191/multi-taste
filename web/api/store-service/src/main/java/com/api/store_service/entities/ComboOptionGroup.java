package com.api.store_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreComboOptionGroup {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int minSelect;
    private int maxSelect;
    @OneToMany
    private List<ComboOption> comboOptions;
}
