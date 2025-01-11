package com.prueba.api.franquicia.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "franchis")
public class Franchis {

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    @Column(name ="franchis_id")
    private int franchisId;
    @Column(name = "franchis_name")
    private String franchisName;
    @Column(name = "branch_id")
    private int branchId;

    public Franchis (int franchisId, String franchisName, int branchId){

        this.franchisId = franchisId;
        this.franchisName = franchisName;
        this.branchId = branchId;
    }

    public Franchis(){
        
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
