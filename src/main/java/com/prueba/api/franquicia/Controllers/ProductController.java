package com.prueba.api.franquicia.Controllers;

import com.prueba.api.franquicia.Models.Product;
import com.prueba.api.franquicia.Services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

        @Autowired
        private ProductService productService;

        @PostMapping("/addNewProduct")
        public Product addProduct(@RequestBody Product product){
            return productService.createProduct(product);
        }

        @GetMapping("/getAllProducts")
        public List<Product> getProductsList(){
            return productService.getAllProducts();
        }

        @DeleteMapping("/deleteProduct/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable int id){
            try {
                productService.deleteProduct(id);
                return ResponseEntity.ok("Product deleted succefully");
            } catch (IllegalArgumentException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
            }
        }

}
