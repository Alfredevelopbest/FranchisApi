package com.prueba.api.franquicia.Models;

public class Product {
    private int productId;
    private String name;
    private double stockAmount;

    public Product(String name, double stockAmount, int productId){
        this.productId = productId;
        this.name = name;
        this.stockAmount = stockAmount;
    }

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
