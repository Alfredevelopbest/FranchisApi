package com.prueba.api.franquicia.Models;

public class Branch {
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

    public String getNameBranch ()[
        return nameBranch;
    ]

    public void setNameBranch (String nameBranch){
        this.nameBranch = nameBranch;
    }

    public int getIdProduct(){
        return idProduct;
    }

}
