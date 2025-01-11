package com.prueba.api.franquicia.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "branch")

public class Branch {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    @Column(name = "id_branch")
    private int idBranch;
    @Column(name = "name_branch")
    private String nameBranch;
    @Column(name ="id_product", nullable = true)
    private int idProduct;

    public Branch(int idBranch, String nameBranch, int idProduct){
        this.idBranch = idBranch;
        this.nameBranch = nameBranch;
        this.idProduct = idProduct;
    }
 
    public Branch(){
        
    }

    public int getIdBranch(){
        return idBranch;
    }

    public void setIdBranch(int idBranch){
        this.idBranch = idBranch;
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

    public void setIdProduct(int idProduct){
        this.idProduct = idProduct;
    }

}
