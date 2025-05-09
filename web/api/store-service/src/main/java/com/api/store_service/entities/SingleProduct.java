package com.api.store_service.entities;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreSingleProduct extends StoreProduct {
    @ElementCollection
    private List<Long> singleProductCustomizationsIds;
}
