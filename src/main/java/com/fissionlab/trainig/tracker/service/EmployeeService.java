package com.fissionlab.trainig.tracker.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fissionlab.trainig.tracker.entity.Employee;
import com.fissionlab.trainig.tracker.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fissionlab.trainig.tracker.repository.EmployeeRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmployeeService {

	 @Autowired
	private EmployeeRepository employeeRepository;
	
	 public List<Employee> getAllEmployees() {
		 log.info("Started with get employees");

	        return employeeRepository.findAll();
	    }
	 
	 public Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException {
		 log.info("Started with get employees by id");
		 Employee employee = employeeRepository.findById(employeeId)
		    		  .orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		      return employee;
		 
		    }

	 public Employee createEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    public Employee updateEmployee(Long employeeId,
	         Employee employeeDetails) throws ResourceNotFoundException {
	        Employee employee = employeeRepository.findById(employeeId)
	        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

	        employee.setEmailId(employeeDetails.getEmailId());
	        employee.setLastName(employeeDetails.getLastName());
	        employee.setFirstName(employeeDetails.getFirstName());
	        final Employee updatedEmployee = employeeRepository.save(employee);
	        return updatedEmployee;
	    }

	    
	    public Map<String, Boolean> deleteEmployee(Long employeeId)
	         throws ResourceNotFoundException {
	        Employee employee = employeeRepository.findById(employeeId)
	       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	        employeeRepository.delete(employee);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	}
