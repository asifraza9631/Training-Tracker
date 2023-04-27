package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.entity.Skills;
import java.util.List;


public interface OrganizationService {


    public List<Organization> getAllOrganization();

    public List<Practice> getAllPractice();

    public List<Skills> getAllSkills();

    public List<Designation> getAllDesignation();


}
