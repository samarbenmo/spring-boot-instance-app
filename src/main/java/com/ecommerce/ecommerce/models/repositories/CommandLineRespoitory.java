package com.ecommerce.ecommerce.models.repositories;

import com.ecommerce.ecommerce.models.entities.CommandLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandLineRespoitory extends JpaRepository<CommandLine, Integer> {
}
