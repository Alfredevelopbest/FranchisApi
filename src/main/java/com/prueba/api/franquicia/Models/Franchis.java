package com.prueba.api.franquicia.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity

public class Franchis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int franchisId;
    private String franchisName;
    private int branchId;

    public Franchis (int franchisId, String franchisName, int branchId){

        this.franchisId = franchisId;
        this.franchisName = franchisName;
        this.branchId = branchId;
    }

    public int getfranchisId(){
        return franchisId;
    }

    public String getFranchisName (){
        return franchisName;
    }

    public void setFranchisName(String franchisName){
        this.franchisName = franchisName;
    }

    public int getBranchId(){
        return branchId;
    }

}
