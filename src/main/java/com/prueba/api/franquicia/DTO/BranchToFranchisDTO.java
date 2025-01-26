package com.prueba.api.franquicia.DTO;



public class BranchToFranchisDTO {
    
    private int idBranch;
    private int franchisId;

    //Getters & setters

    public BranchToFranchisDTO(int idBranch, int franchisId) {
        this.idBranch = idBranch;
        this.franchisId = franchisId;
    }
    
    public int getIdBranch() {
        return idBranch;
    }
    public void setIdBranch(int idBranch) {
        this.idBranch = idBranch;
    }
    public int getFranchisId() {
        return franchisId;
    }
    public void setFranchisId(int franchisId) {
        this.franchisId = franchisId;
    }
    
    
    
    
}
