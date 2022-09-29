
package com.example.demo.repositories;

import com.example.demo.entities.Costume;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CostumeCrudRepository extends JpaRepository<Costume, Integer> {
    
}
