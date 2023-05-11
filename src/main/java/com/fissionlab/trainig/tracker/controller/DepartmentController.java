package com.fissionlab.trainig.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;
import com.fissionlab.trainig.tracker.service.impl.DepartmentServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class DepartmentController {

	@Autowired
	private DepartmentServiceImpl departmentService;

	@GetMapping(EndPointConfig.ORGANIZATION_DEPARTMENT_DETAILS)
	public ResponseEntity<List<Departments>> getAllDepartment() throws DepartmentNotFoundException {
		    List<Departments>  departments = departmentService.getAllDepartments();

		if (departments.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(departments, HttpStatus.OK);
		}
	}

    @GetMapping(EndPointConfig.ORGANIZATION_DEPARTMENT_DETAILS_SEARCH)
    public ResponseEntity<List<Departments>> searchDeparmentBasedOnName(@RequestParam("query") String query)  throws DepartmentNotFoundException {
        List<Departments> skills = departmentService.getDepartmentListBasedOnName(query);

        if (skills.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(skills, HttpStatus.OK);
        }

    }


}

