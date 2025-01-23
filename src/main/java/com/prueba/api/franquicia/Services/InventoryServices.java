package com.prueba.api.franquicia.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.api.franquicia.Models.Branch;
import com.prueba.api.franquicia.Models.Inventory;
import com.prueba.api.franquicia.Models.Product;
import com.prueba.api.franquicia.Repository.InventoryRepository;

@Service
public class InventoryServices {
@Autowired
InventoryRepository inventoryRepository;
Inventory inventory;
Branch branch;
Product product;
    public Inventory addBranchToFranchis(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public Inventory addProductToBranch(Inventory inventory ){
        return inventoryRepository.save(inventory);
    }
}

