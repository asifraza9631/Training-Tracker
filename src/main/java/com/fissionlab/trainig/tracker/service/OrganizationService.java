package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import lombok.Setter;

import java.util.List;


public interface OrganizationService {

     public List<Organization> getAllOrganization();

     public  List<Practice>  getAllPractice();



}
