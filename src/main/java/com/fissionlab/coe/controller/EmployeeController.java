package com.fissionlab.coe.controller;

import java.util.List;
import java.util.Map;
import com.fissionlab.coe.config.EndPointConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fissionlab.coe.entity.Employee;
import com.fissionlab.coe.exception.ResourceNotFoundException;
import com.fissionlab.coe.service.EmployeeService;

@RestController
@RequestMapping(value = EndPointConfig.API_V1)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value =  EndPointConfig.WELCOME)
	public String welcome() {
		return "Welcome to COE Base project";
	}

	@GetMapping(value =  EndPointConfig.GET_ALL_EMPLOYEES)

	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}


	@GetMapping(value =  EndPointConfig.GET_EMPLOYEE_BY_ID)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping(value =  EndPointConfig.SAVE_EMPLOYEE)
	public Employee createEmployee(@Validated @RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping(value = EndPointConfig.UPDATE_EMPLOYEE)
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Validated @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee = employeeService.updateEmployee(employeeId, employeeDetails);
		return ResponseEntity.ok(employee);
	}

	@DeleteMapping(value =  EndPointConfig.DELETE_EMPLOYEE_BY_ID)
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Map<String, Boolean> response = employeeService.deleteEmployee(employeeId);
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
