package com.prueba.api.franquicia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.api.franquicia.DTO.BranchToFranchisDTO;
import com.prueba.api.franquicia.Models.Inventory;
import com.prueba.api.franquicia.Services.InventoryServices;
import com.prueba.api.franquicia.DTO.ProductToBranchDTO;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryServices inventoryServices;

    @PostMapping("/addBranchToFranchis")
    public Inventory addBranchToFranchis(@RequestBody BranchToFranchisDTO branchToFranchisDTO){
        Inventory inventory = new Inventory();
        inventory.setBranchId(branchToFranchisDTO.getIdBranch());
        inventory.setIdFranchis(branchToFranchisDTO.getFranchisId());
        return inventoryServices.postMethod(inventory);
    }

    @PostMapping("/addProductToBranch")
    public Inventory addProductToBranch(@RequestBody ProductToBranchDTO productToBranchDTO){
        Inventory inventory = new Inventory();
        inventory.setBranchId(productToBranchDTO.getIdBranch());
        inventory.setIdProduct(productToBranchDTO.getProductId());
        return inventoryServices.postMethod(inventory);
    }

    @PatchMapping("/deleteProductInBranch")
    public Inventory deleteProductToBranch(@RequestBody ProductToBranchDTO productToBranchDTO){
        return inventoryServices.updateMethod(productToBranchDTO);
    }
}

