package com.ecommerce.ecommerce.models.repositories;

import com.ecommerce.ecommerce.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
