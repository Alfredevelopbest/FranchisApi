package com.prueba.api.franquicia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.api.franquicia.Models.Franchis;
import com.prueba.api.franquicia.Services.FranchisService;

@RequestMapping("/franchis")
@RestController

public class FranchisController {
    
    @Autowired
    private FranchisService franchisService;

    @PostMapping
    @RequestMapping("/createFranchis")
    public Franchis postFranchis(Franchis franchis){
        return franchisService.createFranchis(franchis);
    }
}
