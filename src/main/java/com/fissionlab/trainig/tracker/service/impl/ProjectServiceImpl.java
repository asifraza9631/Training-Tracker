package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Project;
import com.fissionlab.trainig.tracker.repository.ProjectRepository;
import com.fissionlab.trainig.tracker.service.ProjectService;

import jakarta.transaction.Transactional;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	@Transactional
	public List<Project> getProjectListBasedOnName(String query) {
		return projectRepository.findByNameContainingIgnoreCase(query);
	}

}
