package com.prueba.api.franquicia.Services;

import com.prueba.api.franquicia.Models.Franchis;
import com.prueba.api.franquicia.Repository.FranchisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FranchisService {
    
    @Autowired

    private FranchisRepository franchisRepository;

    public Franchis createFranchis(Franchis franchis){
        if(franchisRepository.existsById(franchis.getfranchisId())){
            throw new IllegalArgumentException("Id: " + franchis.getfranchisId() + " already exist.");
        }
        return franchisRepository.save(franchis);
    }

   
    
    
}
