package com.prueba.api.franquicia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.prueba.api.franquicia.Models.Branch;
import com.prueba.api.franquicia.Repository.BranchRepository;
@Service

public class BranchService {
    
    @Autowired
    public BranchRepository branchRepository;

    public Branch createNewBranch(Branch branch){
        if(branchRepository.existsById(branch.getIdBranch())){
            throw new IllegalArgumentException("Id " + branch.getIdBranch() + " is already exist.");
        }
        return branchRepository.save(branch);
    }

    public List<Branch> getBranchList(){
        return branchRepository.findAll();
    }

    public Branch addProductToBranch(Branch branch){
        if(branchRepository.existsById(branch.getIdBranch())){
            throw new IllegalAccessError("Id " + branch.getIdBranch() + " is already exist:");
        }
        return branchRepository.save(branch);
    }

    

}
 