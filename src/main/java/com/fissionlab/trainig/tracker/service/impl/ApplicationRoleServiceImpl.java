package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.entity.ApplicationRole;
import com.fissionlab.trainig.tracker.repository.ApplicationRoleRepository;
import com.fissionlab.trainig.tracker.service.ApplicationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationRoleServiceImpl implements ApplicationRoleService {

    @Autowired
    private ApplicationRoleRepository applicationRoleRepository;


    @Override
    public List<ApplicationRole> getAllRoles() {
        List<ApplicationRole> listApp = applicationRoleRepository.findAll();
        return listApp;
    }
}
