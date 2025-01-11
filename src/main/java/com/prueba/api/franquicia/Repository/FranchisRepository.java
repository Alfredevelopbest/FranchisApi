package com.prueba.api.franquicia.Repository;
import com.prueba.api.franquicia.Models.Franchis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FranchisRepository extends JpaRepository<Franchis, Integer> {
    
}
