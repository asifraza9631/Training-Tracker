package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.entity.Practice;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;
import com.fissionlab.trainig.tracker.exception.PracticeNotFoundException;

@Service
public interface PracticeService {
	

	public List<Practice> getAllPractices() throws PracticeNotFoundException;

	public List<Practice> getPracticeListBasedOnName(String name);
}