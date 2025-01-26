package com.prueba.api.franquicia.DTO;

public class ProductToBranchDTO {
    
    private int idBranch;
    private int productId;

    //Builder method;
    public ProductToBranchDTO(int idBranch, int productId){
        this.idBranch = idBranch;
        this.productId = productId;
    }

    public void setIdBranch(int idBranch){
        this.idBranch = idBranch;
    }

    public int getIdBranch(){
        return idBranch;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public int getProductId(){
        return productId;
    }
}
