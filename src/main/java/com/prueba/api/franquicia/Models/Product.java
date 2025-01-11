package com.prueba.api.franquicia.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name ="product")

public class Product {

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name = "product_id")
    private int productId;
    @Column(name="name_product")
    private String nameProduct;
    @Column(name = "stock_amount")
    private double stockAmount;

    //Builder method
    public Product(String nameProduct, double stockAmount, int productId){
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.stockAmount = stockAmount;
    }

    public Product(){
        
    }

    //Getters and seters
    public int getProductId(){
        return productId;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    public double getStockAmount(){
        return stockAmount;
    }

    public void setStockAmount(double stockAmount){
        this.stockAmount = stockAmount;
    }


}
