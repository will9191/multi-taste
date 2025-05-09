package com.api.customization_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizationRepository extends MongoRepository<Customization, Long> {

}
