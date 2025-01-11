package com.prueba.api.franquicia.Repository;

import com.prueba.api.franquicia.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
