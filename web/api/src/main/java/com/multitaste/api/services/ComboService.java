package com.multitaste.api.services;

import com.multitaste.api.dto.request.ComboRequestDTO;
import com.multitaste.api.entities.Combo;

import java.util.List;

public interface ComboService {
    Combo save(ComboRequestDTO dto);
    List<Combo> findAll();
}
