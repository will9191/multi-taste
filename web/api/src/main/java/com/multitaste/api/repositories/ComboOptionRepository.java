package com.multitaste.api.repositories;

import com.multitaste.api.entities.ComboOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboOptionRepository extends JpaRepository<ComboOption, Long> {
}
