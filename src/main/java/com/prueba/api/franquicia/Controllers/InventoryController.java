package com.prueba.api.franquicia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.api.franquicia.Models.Inventory;
import com.prueba.api.franquicia.Services.InventoryServices;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryServices inventoryServices;
     
    @PostMapping("/addBranchToFranchis")
    public Inventory addBranchToFranchis(@RequestBody Inventory inventory ){
        return inventoryServices.addBranchToFranchis(inventory);
    }

    @PostMapping("/addProductToBranch")
    public Inventory addNewProductToBranch(@RequestBody Inventory inventory){
        return inventoryServices.addProductToBranch();
    }
}

