package com.prueba.api.franquicia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.api.franquicia.Models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Integer> {
    
}
