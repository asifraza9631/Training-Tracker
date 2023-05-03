package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;

@Service
public interface DepartmentService {

	public List<Departments> getAllDepartments() throws DepartmentNotFoundException;

	public List<Departments> getDepartmentListBasedOnName(String name);
}