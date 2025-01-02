package com.prueba.api.franquicia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idBranch;
    private String nameBranch;
    private int idProduct;

    public Branch(int idBranch, String nameBranch, int idProduct){
        this.idBranch = idBranch;
        this.nameBranch = nameBranch;
        this.idProduct = idProduct;
    }

    public int getIdBranch(){
        return idBranch;
    }

    public String getNameBranch (){
        return nameBranch;
    }

    public void setNameBranch (String nameBranch){
        this.nameBranch = nameBranch;
    }

    public int getIdProduct(){
        return idProduct;
    }

}
