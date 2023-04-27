package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.repository.OrganizationRepository;
import com.fissionlab.trainig.tracker.service.OrganizationService;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class OrganizationServiceImpl implements OrganizationService {

     @Autowired
  private OrganizationRepository organizationRepository;

    @Override
    public List<Organization> getAllOrganization() {
        return organizationRepository.findAll();
    }
}
