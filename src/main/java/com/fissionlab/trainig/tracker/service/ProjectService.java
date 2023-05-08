package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Project;

@Service
public interface ProjectService {
	
	List<Project> getProjectListBasedOnName(String query);
	}


