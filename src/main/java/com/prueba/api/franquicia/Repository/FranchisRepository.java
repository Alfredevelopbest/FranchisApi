package com.prueba.api.franquicia.Repository;
import com.prueba.api.franquicia.Models.Franchis;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchisRepository extends JpaRepository<Franchis, Integer> {
    Optional<Franchis> findByFranchisName(String franchisName);
}
