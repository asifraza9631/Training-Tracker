package com.fissionlab.trainig.tracker.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.ClientDTO;
import com.fissionlab.trainig.tracker.DTO.ProjectDTO;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Project;
import com.fissionlab.trainig.tracker.exception.ClientNotFoundException;
import com.fissionlab.trainig.tracker.repository.ClientRepository;
import com.fissionlab.trainig.tracker.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override

	public List<Client> getAllClient() throws ClientNotFoundException {

		try {
			List<Client> clients = clientRepository.findAll();
			return clients;
		} catch (Exception e) {
			throw new ClientNotFoundException(" Client Details not found");
		}
	}

	public List<Client> getClientListBasedOnName(String name) throws ClientNotFoundException {
		List<Client> clients = clientRepository.findByNameContainingIgnoreCase(name);
		if (clients.isEmpty()) {
			throw new ClientNotFoundException("No clients found with name: " + name);
		}

		return clients;
	}

	@Override
	public ClientDTO getClientDetailsById(String id) throws ClientNotFoundException {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ClientNotFoundException("No client found with ID: " + id));
		ClientDTO clientDTO = new ClientDTO();
		clientDTO.setId(client.getId());
		clientDTO.setName(client.getName());
		clientDTO.setOrgId(client.getOrgId());
		clientDTO.setStartDate(client.getStartDate());
		clientDTO.setEndDate(client.getEndDate());
		clientDTO.setStatus(client.getStatus());
		return clientDTO;
	}

	@Override
	public List<ProjectDTO> getProjectsByClientId(String clientId) throws ClientNotFoundException {
		Client client = clientRepository.findById(clientId)
				.orElseThrow(() -> new ClientNotFoundException("No client found with ID: " + clientId));
		List<ProjectDTO> projectDTOs = new ArrayList<>();
		for (Project project : client.getProjects()) {
			ProjectDTO projectDTO = new ProjectDTO();
			projectDTO.setId(project.getId());
			projectDTO.setName(project.getName());
			projectDTO.setType(project.getType());
			projectDTO.setStartDate(project.getStartDate());
			projectDTO.setEndDate(project.getEndDate());
			projectDTO.setOrgId(project.getOrgId());
			projectDTO.setClientId(project.getClient().getId());
			projectDTOs.add(projectDTO);
		}
		return projectDTOs;
	}

}
