package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String street;
    private String neighborhood;
    private Integer number;
    private String city;
    private String state;
    private String country;
    private String complement;
    private String residence;
    private BigDecimal latitude;
    private BigDecimal longitude;

}
