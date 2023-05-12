package com.fissionlab.trainig.tracker.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Designation;
import com.fissionlab.trainig.tracker.exception.DesignationNotFoundException;
import com.fissionlab.trainig.tracker.service.impl.DesignationServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
@Tag(name = "designations")
public class DesignationController {

	@Autowired
	private DesignationServiceImpl designationService;

	@GetMapping(EndPointConfig.DESIGNATION)
	public ResponseEntity<List<Designation>> getAllDesignation() throws DesignationNotFoundException {
		List<Designation> designations = designationService.getAllDesignation();

		if (designations.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(designations, HttpStatus.OK);
		}
	}

	@GetMapping(EndPointConfig.DESIGNATION_DETAILS_SEARCH)
	public ResponseEntity<List<Designation>> searchDesignationBasedOnName(@RequestParam("query") String query)
			throws DesignationNotFoundException {
		List<Designation> skills = designationService.getDesignationListBasedOnName(query);

		if (skills.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(skills, HttpStatus.OK);
		}

	}

}
