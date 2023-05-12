package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fissionlab.trainig.tracker.DTO.ManagerDto;
import com.fissionlab.trainig.tracker.entity.Manager;
import com.fissionlab.trainig.tracker.enums.ClientStatus;
import com.fissionlab.trainig.tracker.DTO.ClientDto;
import com.fissionlab.trainig.tracker.DTO.ProjectDTO;
import com.fissionlab.trainig.tracker.entity.Project;
import com.fissionlab.trainig.tracker.repository.ManagerRepository;
import com.fissionlab.trainig.tracker.service.ClientService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.repository.ClientRepository;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	 @Autowired
	private ManagerRepository managerRepository;


	@Override
	public Client createClientWithManger(ClientDto clientDTO, HttpServletRequest request) {

		String orgId = request.getHeader("orgId");
		Client client = new Client();
		// create and persist the manager entity
		ManagerDto managerDTO = clientDTO.getManagerDto();
		if (managerDTO != null) {
			Manager manager = new Manager();
			manager.setCreatedBy(managerDTO.getCreatedBy());
			manager.setCreatedAt(managerDTO.getCreatedAt());
			manager.setModifiedBy(managerDTO.getModifiedBy());
			manager.setModifiedAt(managerDTO.getModifiedAt());
			manager.setName(managerDTO.getName());
			manager.setType(managerDTO.getType());
			client.setManager(manager);
		}

// create and persist the client entity

		client.setName(clientDTO.getName());
		if (clientDTO.getEndDate() != null) {
			client.setStatus(String.valueOf(ClientStatus.INACTIVE));
		} else {
			client.setStatus(String.valueOf(ClientStatus.ACTIVE));
		}
		client.setStartDate(clientDTO.getStartDate());
		client.setEndDate(clientDTO.getEndDate());
		client.setOrgId(orgId);

		List<ProjectDTO> projectDTOList = clientDTO.getProjects();

		if (!projectDTOList.isEmpty()) {
			List<Project> projects = projectDTOList.stream()
					.map(projectDTO -> {
						Project project = new Project();
						project.setName(projectDTO.getName());
						project.setType(projectDTO.getType());
						project.setOrgId(orgId);
						project.setStartDate(projectDTO.getStartDate());
						project.setEndDate(projectDTO.getEndDate());
						project.setClient(client);
						return project;
					})
					.collect(Collectors.toList());
			client.setProjects(projects);
		}

		return clientRepository.save(client);


	}

	@Override
	public Client createClient(ClientDto clientDTO, HttpServletRequest request) {

		String orgId = request.getHeader("orgId");

		 Client client = new Client();
		 ClientDto clientDto1 = new ClientDto();
		 client.setName(clientDTO.getName());
		 if(clientDTO.getEndDate() !=null)
		 {
			 client.setStatus(String.valueOf(ClientStatus.INACTIVE));
		 }
         else
		 {
			  client.setStatus(String.valueOf(ClientStatus.ACTIVE));
		 }

		 client.setStartDate(clientDTO.getStartDate());
		 client.setEndDate(clientDTO.getEndDate());
         client.setOrgId(orgId);

		List<ProjectDTO> projectDTOList = clientDTO.getProjects();
		List<Project> projects = projectDTOList.stream()
				.map(projectDTO -> {
					Project project = new Project();
					project.setName(projectDTO.getName());
					project.setType(projectDTO.getType());
					project.setOrgId(orgId);
					project.setStartDate(projectDTO.getStartDate());
					project.setEndDate(projectDTO.getEndDate());
					project.setClient(client);
					return project;
				})
				.collect(Collectors.toList());

		client.setProjects(projects);
		 return   clientRepository.save(client);
	}

	@Override
	public ClientDto getClientById(String id, HttpServletRequest request) throws Exception {

		  ClientDto clientDTO = new ClientDto();
		try {
			Optional<Client> optionalClient = clientRepository.findById(id);
			if (optionalClient.isPresent()) {
			                 Client client = optionalClient.get();
							 clientDTO.setId(client.getId());
							 clientDTO.setName(client.getName());
							 clientDTO.setOrgId(client.getOrgId());
							 clientDTO.setStatus(client.getStatus());
			              Manager manager = client.getManager();
						  ManagerDto managerDTO = new ManagerDto();
						  managerDTO.setName(manager.getName());
						  managerDTO.setType(manager.getType());
								   clientDTO.setManagerDto(managerDTO);
							 return  clientDTO;
			} else {
				throw new Exception("Client not found with ID: " + id);
			}
		} catch (Exception e) {
			throw new Exception("Error occurred while getting client by ID: " + id, e);
		}
	}

	@Override
	public String updateClientById(String id, String status) {
		log.info(status+ "    " + id);
		int count = clientRepository.updateClientStatusById(id, status);
		return  "updated";
	}

}
