package com.api.store_service.entities;

import jakarta.persistence.OneToMany;

import java.util.List;

public class StoreCombo extends StoreProduct{
    @OneToMany
    private List<StoreComboItem> comboItems;
    @OneToMany
    private List<StoreComboOptionGroup> comboOptionGroups;
}
