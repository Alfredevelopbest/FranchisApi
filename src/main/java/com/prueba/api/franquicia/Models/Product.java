package com.prueba.api.franquicia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int productId;
    private String name;
    private double stockAmount;

    //Builder method
    public Product(String name, double stockAmount, int productId){
        this.productId = productId;
        this.name = name;
        this.stockAmount = stockAmount;
    }

    //Getters and seters
    public int getProductId(){
        return productId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getStockAmount(){
        return stockAmount;
    }

    public void setStockAmount(double stockAmount){
        this.stockAmount = stockAmount;
    }


}
