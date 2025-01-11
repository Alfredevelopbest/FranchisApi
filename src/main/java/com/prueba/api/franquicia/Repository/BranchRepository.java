package com.prueba.api.franquicia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.api.franquicia.Models.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
    
}
