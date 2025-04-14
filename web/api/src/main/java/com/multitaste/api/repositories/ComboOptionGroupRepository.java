package com.multitaste.api.repositories;

import com.multitaste.api.entities.ComboOptionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboOptionGroupRepository extends JpaRepository<ComboOptionGroup, Long> {
}
