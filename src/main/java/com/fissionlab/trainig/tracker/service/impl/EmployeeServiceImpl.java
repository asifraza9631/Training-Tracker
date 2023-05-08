package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.DTO.EmployeeDTO;
import com.fissionlab.trainig.tracker.entity.Employee;
import com.fissionlab.trainig.tracker.repository.EmployeeRepository;
import com.fissionlab.trainig.tracker.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {


     @Autowired
     private EmployeeRepository employeeRepository;

     @Override
    public Employee createEmployee(EmployeeDTO employeeDTO, HttpServletRequest request) {

        String orgId = request.getHeader("orgId");
           Employee employee = new Employee();

           employee.setNotes(employeeDTO.getNotes());
           employee.setNickname(employeeDTO.getNickname());
           employee.setStatus(employeeDTO.getStatus());
           employee.setLocation(employeeDTO.getLocation());
           employee.setOrgEmpId(employeeDTO.getOrgEmpId());
           employee.setOrgId(orgId);
           employee.setLastName(employeeDTO.getLastName());
           employee.setFirstName(employeeDTO.getFirstName());
           employee.setGender(employeeDTO.getGender());
           employee.setContactNumber(employeeDTO.getContactNumber());
           employee.setActive(employeeDTO.isActive());
           employee.setBillable(employeeDTO.isBillable());
           employee.setEmail(employeeDTO.getEmail());
           employee.setDepartment(employeeDTO.getDepartments());
           employee.setType(employeeDTO.getType());
           employee.setDesignation(employeeDTO.getDesignation());
           employee.setPractice(employeeDTO.getPractice());
           employee.setCreatedBy(employeeDTO.getCreatedBy());
           employee.setCreatedTime(employeeDTO.getCreatedTime());
           employee.setModifiedBy(employeeDTO.getModifiedBy());
           employee.setModifiedBy(employeeDTO.getModifiedBy());
           employee.setFissionStartDate(employeeDTO.getFissionStartDate());


             Employee savedEmployee = employeeRepository.save(employee);

           log.info("employee save successfully =====>  " + savedEmployee.getId());
           return  savedEmployee;



    }
}
