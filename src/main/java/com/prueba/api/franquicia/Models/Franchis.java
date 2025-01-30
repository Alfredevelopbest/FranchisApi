package com.prueba.api.franquicia.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "franchis")
public class Franchis {

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    @Column(name ="franchis_id")
    private int franchisId;
    @Column(name = "franchis_name")
    private String franchisName;

    //Builder method

    public Franchis (int franchisId, String franchisName){

        this.franchisId = franchisId;
        this.franchisName = franchisName;
    }

    //Getters & setters    

    public Franchis(){
        
    }

    public void setFranchisId(int franchisId){
        this.franchisId = franchisId;
    }

    public int getFranchisId(){
        return franchisId;
    }

    public String getFranchisName (){
        return franchisName;
    }

    public void setFranchisName(String franchisName){
        this.franchisName = franchisName;
    }

    @Override
    public String toString(){
        return "Franchis: {" + 
            "Franchis{" + "franchisId: " 
            + franchisId + ",franchisName: "
            + franchisName + ",branchId: "
            + "}";
    }

}
