package com.prueba.api.franquicia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.api.franquicia.Models.Branch;
import com.prueba.api.franquicia.Repository.BranchRepository;
@Service

public class BranchService {
    
    @Autowired
    public BranchRepository branchRepository;

    public Branch createNewBranch(Branch branch){
        return branchRepository.save(branch);
    }

}
