package com.ecommerce.ecommerce.models.repositories;

import com.ecommerce.ecommerce.models.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<Command, String> {
}
