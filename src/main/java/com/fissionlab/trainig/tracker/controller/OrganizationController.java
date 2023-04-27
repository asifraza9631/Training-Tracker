package com.fissionlab.trainig.tracker.controller;

import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.service.impl.OrganizationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class OrganizationController {

    @Autowired
    private OrganizationServiceImpl organizationService;

     @GetMapping(EndPointConfig.ORGANIZATION_DETAILS)
     public ResponseEntity<List<Organization>> getAllOrganizations() {
         List<Organization> organizations = organizationService.getAllOrganization();

         if (organizations.isEmpty()) {
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         } else {
             return new ResponseEntity<>(organizations, HttpStatus.OK);
         }
     }


    @GetMapping(EndPointConfig.ORGANIZATION_PRACTICE_DETAILS)
    public ResponseEntity<List<Practice>> getAllPractices() {
        List<Practice>   practices = organizationService.getAllPractice();

        if (practices.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(practices, HttpStatus.OK);
        }
    }
}
