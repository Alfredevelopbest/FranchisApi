package com.prueba.api.franquicia.Controllers;

import com.prueba.api.franquicia.Models.Product;
import com.prueba.api.franquicia.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

        @Autowired
        private ProductService productService;

        @PostMapping
        public Product addProduct(@RequestBody Product product){
            return productService.createProduct(product);
        }

    
    
}