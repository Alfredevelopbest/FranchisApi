package com.prueba.api.franquicia.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.api.franquicia.DTO.ProductToBranchDTO;
import com.prueba.api.franquicia.Models.Inventory;
import com.prueba.api.franquicia.Repository.InventoryRepository;

@Service
public class InventoryServices {
@Autowired
InventoryRepository inventoryRepository;
Inventory inventory;

    public Inventory postMethod(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public Inventory updateMethod(ProductToBranchDTO productToBranchDTO){
        Inventory inventory = new Inventory();
        inventory.setBranchId(productToBranchDTO.getIdBranch());
        inventory.setIdProduct(productToBranchDTO.getProductId());
        if(inventory.getIdProduct() != null){
            inventory.setIdProduct(null);
        }
        return inventoryRepository.save(inventory);
    }
}


