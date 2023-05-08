package com.fissionlab.trainig.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.DTO.ClientDTO;
import com.fissionlab.trainig.tracker.DTO.ProjectDTO;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.exception.ClientNotFoundException;

@Service
public interface ClientService {

	List<Client> getClientListBasedOnName(String name) throws ClientNotFoundException;

	List<ProjectDTO> getProjectsByClientId(String clientId) throws ClientNotFoundException;

	List<Client> getAllClient() throws ClientNotFoundException;

	ClientDTO getClientDetailsById(String id) throws ClientNotFoundException;
}
