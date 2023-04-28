package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.entity.Skills;
import com.fissionlab.trainig.tracker.repository.DesignationRepository;
import com.fissionlab.trainig.tracker.repository.OrganizationRepository;
import com.fissionlab.trainig.tracker.repository.PracticeRepository;
import com.fissionlab.trainig.tracker.repository.SkillsRepository;
import com.fissionlab.trainig.tracker.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Autowired
    private PracticeRepository practiceRepository;

    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Override
    public List<Organization> getAllOrganization() {
        return organizationRepository.findAll();
    }

    @Override
    public List<Practice> getAllPractice() {
        return practiceRepository.findAll();
    }

    @Override
    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();

    }

    @Override
    public List<Designation> getAllDesignation() {
        return designationRepository.findAll();
    }


}
