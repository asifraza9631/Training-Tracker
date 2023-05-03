package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;
import com.fissionlab.trainig.tracker.repository.DepartmentRepository;
import com.fissionlab.trainig.tracker.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Departments> getAllDepartments() throws DepartmentNotFoundException {

		try {
			List<Departments> departments = departmentRepository.findAll();
			return departments;
		} catch (Exception e) {
			throw new DepartmentNotFoundException(" Department Details not found");
		}
	}

	@Override
	public List<Departments> getDepartmentListBasedOnName(String name) {

		List<Departments> departments = departmentRepository.findByNameContainingIgnoreCase(name);
		return departments;

	}

	
}