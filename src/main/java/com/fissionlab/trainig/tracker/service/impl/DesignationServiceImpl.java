package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;
import com.fissionlab.trainig.tracker.exception.DesignationNotFoundException;
import com.fissionlab.trainig.tracker.repository.DesignationRepository;
import com.fissionlab.trainig.tracker.service.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationRepository designationRepository;

	@Override
	public List<Designation> getAllDesignation() throws DesignationNotFoundException{
		try {
			List<Designation> designations = designationRepository.findAll();
			return designations;
		} catch (Exception e) {
			throw new DesignationNotFoundException(" Desigantion Details not found");
		}
	}

	@Override
	public List<Designation> getDesignationListBasedOnName(String name) {

		List<Designation> designations = designationRepository.findByNameContainingIgnoreCase(name);
		return designations;

		
		
	}


}
