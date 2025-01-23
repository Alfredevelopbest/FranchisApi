package com.prueba.api.franquicia.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")

public class Inventory {

    @Column(name = "id_inventory")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idInventory;
    @Column(name = "id_product", nullable = true)
    private Integer idProduct;
    @Column(name = "branch_id", nullable = true)
    private Integer branchId;
    @Column(name = "id_franchis", nullable = true)
    private Integer idFranchis;

    //Builder method

    public Inventory(int idInventory, Integer idProduct, int branchId, int idFranchis){
        this.idInventory = idInventory;
        this.idProduct = idProduct;
        this.branchId = branchId;
        this.idFranchis = idFranchis;
    }

    public Inventory(){

    }

    //Getters & setters

    public void setIdInventory(int idInventory){
        this.idInventory = idInventory;
    }

    public int getIdInventory(){
        return idInventory;
    }

    public void setIdProduct(Integer idProduct){
        this.idProduct = idProduct;
    }

    public Integer getIdProduct(){
        return idProduct;
    }


    public void setBranchId(int branchId){
        this.branchId = branchId;
    }

    public Integer getBranchId(){
        return branchId;
    }

    public void setIdFranchis(int idFranchis){
        this.idFranchis = idFranchis;
    }

    public int getIdFranchis(){
        return idFranchis;
    }


@Override
    public String toString(){
        return  "Inventory: {" + 
                "id inventory " + idInventory + 
                "id Product: " + idProduct + 
                "id Branch: " + branchId + 
                "id Franchis: " + idFranchis + "}";
    }
}
