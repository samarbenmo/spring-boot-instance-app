package com.ecommerce.ecommerce.models.repositories;

import com.ecommerce.ecommerce.models.entities.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Integer> {
}
