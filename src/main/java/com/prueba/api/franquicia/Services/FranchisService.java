package com.prueba.api.franquicia.Services;

import com.prueba.api.franquicia.Models.Franchis;
import com.prueba.api.franquicia.Repository.FranchisRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class FranchisService {
    
    @Autowired

    private FranchisRepository franchisRepository;

    @Transactional
    public Franchis createFranchis(Franchis franchis){
        franchisRepository.findByFranchisName(franchis.getFranchisName()).ifPresent(existing ->{
            throw new IllegalArgumentException("Franchis with name  " + franchis.getFranchisName() + " is already exist", null);
        });
       
        return franchisRepository.save(franchis);
    }

   
    
    
}
