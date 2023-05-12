package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.EmployeeAllocationDTO;
import com.fissionlab.trainig.tracker.entity.EmployeeAllocation;
import com.fissionlab.trainig.tracker.exception.EmployeeAllocationNotFoundException;

@Service
public interface EmployeeAllocationService {

	EmployeeAllocation createEmployeeAllocation(EmployeeAllocationDTO employeeAllocationDto);

	EmployeeAllocation updateEmployeeAllocation(EmployeeAllocation employeeAllocation) throws EmployeeAllocationNotFoundException;

	List<EmployeeAllocation> getAllEmployeeAllocations();

	EmployeeAllocation getEmployeeAllocationById(String id);

	String deleteEmployeeAllocation(String id) throws EmployeeAllocationNotFoundException;
}