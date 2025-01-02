package com.prueba.api.franquicia.Services;

import com.prueba.api.franquicia.Models.Product;
import com.prueba.api.franquicia.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

}
