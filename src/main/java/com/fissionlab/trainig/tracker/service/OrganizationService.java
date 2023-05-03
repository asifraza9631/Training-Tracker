package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Organization;

@Service
public interface OrganizationService {

	public List<Organization> getAllOrganization();

}
