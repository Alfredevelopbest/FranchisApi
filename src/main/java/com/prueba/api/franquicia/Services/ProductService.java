package com.prueba.api.franquicia.Services;

import com.prueba.api.franquicia.Models.Product;
import com.prueba.api.franquicia.Repository.ProductRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(int productId){
        if(productRepository.existsById(productId)){
            productRepository.deleteById(productId);
        }
        else{
            {throw new IllegalArgumentException("ID number " + productId + " does not exist.");}
        }
    }

    

}
