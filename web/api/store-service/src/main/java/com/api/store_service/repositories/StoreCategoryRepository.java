package com.api.store_service.repositories;

import com.api.store_service.entities.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreCategoryRepository extends JpaRepository<StoreCategory, Long> {
    List<StoreCategory> findByStoreId(Long storeId);

    List<StoreCategory> findAllByStoreId(Long storeId);
}
