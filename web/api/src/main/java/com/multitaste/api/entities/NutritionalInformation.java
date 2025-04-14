package com.multitaste.api.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class NutritionalInformation {
    private String nutritional_name;
    private String nutritional_quantity;
}
