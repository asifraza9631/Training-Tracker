package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.DTO.EmployeeDTO;
import com.fissionlab.trainig.tracker.entity.Employee;
import jakarta.servlet.http.HttpServletRequest;

public interface EmployeeService {

          public Employee createEmployee(EmployeeDTO employeeDTO, HttpServletRequest request);
}
