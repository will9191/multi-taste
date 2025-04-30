package com.api.category_service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "slug")
    private String slug;
    @Column(name = "icon")
    private String icon;
    @ElementCollection
    List<Long> productsIds = new ArrayList<>();
    @ElementCollection
    List<Long> combosIds = new ArrayList<>();
}
