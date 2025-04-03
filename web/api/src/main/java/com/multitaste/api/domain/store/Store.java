package com.multitaste.api.domain.store;

import com.multitaste.api.domain.address.Address;

import java.time.LocalDateTime;
import java.util.UUID;

public class Store {
    private UUID id;
    private String name;
    private Address address;
    private LocalDateTime createdAt;
}
