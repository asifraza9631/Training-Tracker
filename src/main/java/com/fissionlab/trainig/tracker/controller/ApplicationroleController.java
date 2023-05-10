package com.fissionlab.trainig.tracker.controller;


import com.fissionlab.trainig.tracker.entity.ApplicationRole;
import com.fissionlab.trainig.tracker.service.ApplicationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class
ApplicationroleController {

    @Autowired
    private ApplicationRoleService applicationRoleService;

    @GetMapping("/roles")
    public List<ApplicationRole> getAllRoles() {
        return applicationRoleService.getAllRoles();
    }
}


