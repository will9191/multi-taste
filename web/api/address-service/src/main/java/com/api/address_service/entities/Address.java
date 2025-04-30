package com.api.address_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id
    @GeneratedValue
    private Long id;
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
