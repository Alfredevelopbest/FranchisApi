package com.prueba.api.franquicia.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "branch")

public class Branch {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_branch")
    private int idBranch;
    @Column(name = "name_branch")
    private String nameBranch;
    @Column(name = "id_franchis")
    private int idFranchis;
    

    //Builder method
    public Branch(int idBranch, String nameBranch, int idFranchis){
        this.idBranch = idBranch;
        this.nameBranch = nameBranch;
        this.idFranchis = idFranchis;
    }

    //Getters & setters
 
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

    public void setIdFranchis(int idFranchis){
        this.idFranchis = idFranchis;
    }

    public int getIdFranchis(){
        return idFranchis;
    }


    @Override
    public String toString() {
    return "Branch{" +
            "idBranch=" + idBranch +
            ", nameBranch='" + nameBranch + 
            "idFranchis=" + idFranchis + "}";
}


}
