package com.fissionlab.trainig.tracker.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.EmployeeAllocationDTO;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Employee;
import com.fissionlab.trainig.tracker.entity.EmployeeAllocation;
import com.fissionlab.trainig.tracker.entity.Project;
import com.fissionlab.trainig.tracker.exception.EmployeeAllocationNotFoundException;
import com.fissionlab.trainig.tracker.repository.EmployeeAllocationRepository;
import com.fissionlab.trainig.tracker.service.EmployeeAllocationService;

@Service
public class EmployeeAllocationServiceImpl implements EmployeeAllocationService {

	@Autowired
	private EmployeeAllocationRepository employeeAllocationRepository;

	@Override
	public EmployeeAllocation createEmployeeAllocation(EmployeeAllocationDTO employeeAllocationDto) {
		EmployeeAllocation employeeAllocation = new EmployeeAllocation();
		Employee employee = new Employee();
		employee.setId(employeeAllocationDto.getEmployeeId());
		employeeAllocation.setEmployee(employee);
		Project project = new Project();
		project.setId(employeeAllocationDto.getProjectId());
		employeeAllocation.setProject(project);
		Client client = new Client();
		client.setId(employeeAllocationDto.getClientId());
		employeeAllocation.setClient(client);
		employeeAllocation.setPrimary(employeeAllocationDto.isPrimary());
		employeeAllocation.setDesignation(employeeAllocationDto.getDesignation());
		employeeAllocation.setRole(employeeAllocationDto.getRole());
		employeeAllocation.setJobType(employeeAllocationDto.getJobType());
		employeeAllocation.setBillable(employeeAllocationDto.isBillable());
		employeeAllocation.setUtilization(employeeAllocationDto.getUtilization());
		employeeAllocation.setNotes(employeeAllocationDto.getNotes());
		employeeAllocation.setStartDate(employeeAllocationDto.getStartDate());
		employeeAllocation.setEndDate(employeeAllocationDto.getEndDate());
		employeeAllocation.setActive(employeeAllocationDto.isActive());

		return employeeAllocationRepository.save(employeeAllocation);
	}

	@Override
	public EmployeeAllocation updateEmployeeAllocation(EmployeeAllocation employeeAllocation) throws EmployeeAllocationNotFoundException {
		EmployeeAllocation existingEmployeeAllocation = employeeAllocationRepository.findById(employeeAllocation.getId()).orElse(null);
		
		if (existingEmployeeAllocation == null) {
			throw new EmployeeAllocationNotFoundException("Employee allocation not found with id " + employeeAllocation.getId());
		}

		existingEmployeeAllocation.setEmployee(employeeAllocation.getEmployee());
		existingEmployeeAllocation.setProject(employeeAllocation.getProject());
		existingEmployeeAllocation.setClient(employeeAllocation.getClient());
		existingEmployeeAllocation.setPrimary(employeeAllocation.isPrimary());
		existingEmployeeAllocation.setDesignation(employeeAllocation.getDesignation());
		existingEmployeeAllocation.setRole(employeeAllocation.getRole());
		existingEmployeeAllocation.setJobType(employeeAllocation.getJobType());
		existingEmployeeAllocation.setBillable(employeeAllocation.isBillable());
		existingEmployeeAllocation.setUtilization(employeeAllocation.getUtilization());
		existingEmployeeAllocation.setNotes(employeeAllocation.getNotes());
		existingEmployeeAllocation.setStartDate(employeeAllocation.getStartDate());
		existingEmployeeAllocation.setEndDate(employeeAllocation.getEndDate());
		existingEmployeeAllocation.setActive(employeeAllocation.isActive());

		return employeeAllocationRepository.save(existingEmployeeAllocation);
	}

	@Override
	public List<EmployeeAllocation> getAllEmployeeAllocations() {
	        List<EmployeeAllocation> employees= employeeAllocationRepository.findAll();
	        
	        
//	        List<EmployeeAllocation> employe=new ArrayList<>();
//	        
//	        for(EmployeeAllocation emp:employees){
//	        	
//	        	
//	        	
//	        	Project project = emp.getProject();
//	        	Client client = emp.getClient();
//	        	Employee employee = emp.getEmployee();
//	        	
//	        	
//	        	
//	        }
	        
	        
			return employees ;
	    }

	@Override
	public EmployeeAllocation getEmployeeAllocationById(String id) {
		return employeeAllocationRepository.findById(id).orElse(null);
	}

	@Override
	public String deleteEmployeeAllocation(String id) throws EmployeeAllocationNotFoundException {
		EmployeeAllocation employeeAllocation = employeeAllocationRepository.findById(id).orElse(null);
		if (employeeAllocation == null) {
			throw new EmployeeAllocationNotFoundException("Employee allocation not found with id " + id);
		}
		employeeAllocationRepository.deleteById(id);
		return id + " This id Allocation will be Deleted";
	}
}