package com.fissionlab.trainig.tracker.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.DTO.DepartmentDTO;
import com.fissionlab.trainig.tracker.DTO.DesignationDTO;
import com.fissionlab.trainig.tracker.DTO.OrganizationDTO;
import com.fissionlab.trainig.tracker.DTO.PracticeDTO;
import com.fissionlab.trainig.tracker.DTO.SkillsDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.entity.Organization;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.entity.Skills;
import com.fissionlab.trainig.tracker.repository.DepartmentRepository;
import com.fissionlab.trainig.tracker.repository.DesignationRepository;
import com.fissionlab.trainig.tracker.repository.OrganizationRepository;
import com.fissionlab.trainig.tracker.repository.PracticeRepository;
import com.fissionlab.trainig.tracker.repository.SkillsRepository;
import com.fissionlab.trainig.tracker.service.impl.OrganizationServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(EndPointConfig.API_V1)
@Slf4j
public class OrganizationController {

	@Autowired
	private OrganizationServiceImpl organizationService;
	
	@Autowired
	private OrganizationServiceImpl organizationServiceImpl;

		

	@GetMapping(EndPointConfig.ORGANIZATION_DETAILS)
	public ResponseEntity<List<Organization>> getAllOrganizations() {
		List<Organization> organizations = organizationService.getAllOrganization();

		if (organizations.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(organizations, HttpStatus.OK);
		}
	}

	@GetMapping("/getorg")
	public  ResponseEntity<OrganizationDTO>  getOrgCompleteDetails(HttpServletRequest request) {
		
		
		OrganizationDTO organizationDTO = organizationServiceImpl.getOrgCompleteDetails(request);
		return  new ResponseEntity<OrganizationDTO>(organizationDTO, HttpStatus.ACCEPTED);
	}
}
	
	
