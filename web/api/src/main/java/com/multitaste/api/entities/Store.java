package com.multitaste.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @OneToOne
    private Address address;
    private LocalDateTime createdAt;

    @PrePersist
    public void onPrePersist () {
        this.setCreatedAt(LocalDateTime.now());
    }
}
