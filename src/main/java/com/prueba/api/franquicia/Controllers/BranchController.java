package com.prueba.api.franquicia.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.api.franquicia.Models.Branch;
import com.prueba.api.franquicia.Services.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
    
    @Autowired
    private BranchService branchService;
    @PostMapping("/addNewBranch")
    public Branch postNewBranch(@RequestBody Branch branch){
        return branchService.createNewBranch(branch);
    
    }
}
