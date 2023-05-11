package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.entity.ApplicationRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationRoleService {


    public List<ApplicationRole> getAllRoles();
}
