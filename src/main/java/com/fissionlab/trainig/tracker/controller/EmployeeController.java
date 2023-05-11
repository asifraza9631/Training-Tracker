package com.fissionlab.trainig.tracker.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fissionlab.trainig.tracker.DTO.EmployeeDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Employee;
import com.fissionlab.trainig.tracker.entity.EmployeeAudit;
import com.fissionlab.trainig.tracker.enums.EmployeeAuditEvent;
import com.fissionlab.trainig.tracker.exception.CustomValidationException;
import com.fissionlab.trainig.tracker.repository.EmployeeAuditRepository;
import com.fissionlab.trainig.tracker.repository.EmployeeRepository;
import com.fissionlab.trainig.tracker.service.impl.EmployeeServiceImpl;
import com.fissionlab.trainig.tracker.utils.Validator;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class EmployeeController {


       @Autowired
    private EmployeeServiceImpl employeeService;

        @Autowired
       private EmployeeRepository employeeRepository;

        @Autowired
        private EmployeeAuditRepository employeeAuditRepository;

              @PostMapping(EndPointConfig.SAVE_EMPLOYEE_DETAILS)
             public String   createEmployee(@RequestBody  @Validated EmployeeDTO employeeDTO, HttpServletRequest request) throws JsonProcessingException {
                 try {
                     Validator.isValidate(employeeDTO);
                     Employee employee = employeeRepository.findByOrgEmpId(employeeDTO.getOrgEmpId());
                     if (employee == null) {
                  Employee emp = employeeService.createEmployee(employeeDTO, request);
                         ObjectMapper mapper = new ObjectMapper();
                         mapper.registerModule(new JavaTimeModule());
                         String jsonData = mapper.writeValueAsString(emp);
                         EmployeeAudit employeeAudit = new EmployeeAudit();
                         employeeAudit.setData(jsonData);
                         employeeAudit.setEmpId(emp.getOrgEmpId());
                         employeeAudit.setEventType(String.valueOf(EmployeeAuditEvent.ADD));
                         employeeAudit.setOrgId(request.getHeader("FL"));
                         employeeAudit.setEventDate(LocalDateTime.now());
                         employeeAuditRepository.save(employeeAudit);
                     }
                     else {
                          return  "employee org id already exists " + employee.getOrgEmpId();
                     }
                 } catch (CustomValidationException e) {
                     throw new RuntimeException(e);
                 }

                   return  "employee created successfully";

             }


}
