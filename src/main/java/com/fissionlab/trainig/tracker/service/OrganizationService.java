package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.OrganizationDTO;
import com.fissionlab.trainig.tracker.entity.Organization;

import jakarta.servlet.http.HttpServletRequest;

@Service
public interface OrganizationService {

	public List<Organization> getAllOrganization();
	
	public OrganizationDTO getOrgCompleteDetails(String request);

}
