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
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Project;
import com.fissionlab.trainig.tracker.exception.ProjectNotFoundException;
import com.fissionlab.trainig.tracker.repository.ClientRepository;
import com.fissionlab.trainig.tracker.service.impl.ProjectServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class ProjectController {
	
	@Autowired
	private ProjectServiceImpl projectService;
	
	@Autowired
	private ClientRepository clientRepository;

	@GetMapping(EndPointConfig.ORGANIZATION_PROJECT_DETAILS_SEARCH)
	public ResponseEntity<List<Project>> searchProjectBasedOnName(@RequestParam("query") String query)throws ProjectNotFoundException {
		List<Project> projects = projectService.getProjectListBasedOnName(query);

		if (projects.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			for (Project project : projects) {
				Client client = project.getClient();
				client.setProjects(clientRepository.findById(client.getId()).orElse(null).getProjects());
			}
			return new ResponseEntity<>(projects, HttpStatus.OK);
		}
	}

}
