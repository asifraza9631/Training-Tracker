package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.exception.DesignationNotFoundException;

@Service
public interface DesignationService {

	public List<Designation> getAllDesignation() throws DesignationNotFoundException;

	List<Designation> getDesignationListBasedOnName(String name);

}
