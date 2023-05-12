package com.fissionlab.trainig.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.DTO.EmployeeAllocationDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.EmployeeAllocation;
import com.fissionlab.trainig.tracker.exception.EmployeeAllocationNotFoundException;
import com.fissionlab.trainig.tracker.service.EmployeeAllocationService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(EndPointConfig.API_V1 + EndPointConfig.EMPLOYEE_ALLOCATIONS)
public class EmployeeAllocationController {

	@Autowired
	private EmployeeAllocationService employeeAllocationService;

	@PostMapping("")
	public ResponseEntity<EmployeeAllocation> createEmployeeAllocation(@RequestBody EmployeeAllocationDTO employeeAllocationDto) {
		EmployeeAllocation createdEmployeeAllocation = employeeAllocationService.createEmployeeAllocation(employeeAllocationDto);
		return new ResponseEntity<>(createdEmployeeAllocation, HttpStatus.CREATED);
	}

	@PutMapping(EndPointConfig.ID)
	public ResponseEntity<EmployeeAllocation> updateEmployeeAllocation(@PathVariable("id") String id,
			@RequestBody EmployeeAllocationDTO employeeAllocationDto) throws EmployeeAllocationNotFoundException {
		EmployeeAllocation employeeAllocation = employeeAllocationService.getEmployeeAllocationById(id);
		if (employeeAllocation == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(employeeAllocation, HttpStatus.OK);
	}

	@GetMapping("")
	public ResponseEntity<List<EmployeeAllocation>> getAllEmployeeAllocations() {
		List<EmployeeAllocation> employeeAllocations = employeeAllocationService.getAllEmployeeAllocations();
		return new ResponseEntity<>(employeeAllocations, HttpStatus.OK);
	}

	@GetMapping(EndPointConfig.ID)
	@Transactional
	public ResponseEntity<EmployeeAllocation> getEmployeeAllocationById(@PathVariable("id") String id) {
		EmployeeAllocation employeeAllocation = employeeAllocationService.getEmployeeAllocationById(id);
		if (employeeAllocation == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(employeeAllocation, HttpStatus.OK);
	}

	@DeleteMapping(EndPointConfig.ID)
	public ResponseEntity<String> deleteEmployeeAllocation(@PathVariable("id") String id) {
		EmployeeAllocation employeeAllocation = employeeAllocationService.getEmployeeAllocationById(id);
		if (employeeAllocation == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
