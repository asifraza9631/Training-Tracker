package com.fissionlab.trainig.tracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.entity.Departments;
import com.fissionlab.trainig.tracker.exception.ClientNotFoundException;
import com.fissionlab.trainig.tracker.exception.DepartmentNotFoundException;
import com.fissionlab.trainig.tracker.repository.ClientRepository;
import com.fissionlab.trainig.tracker.repository.DepartmentRepository;

@Service
public class ClientServiceImpl {

	@Autowired
	private ClientRepository clientRepository;

	/*
	 * @Override public List<Client> getAllClient() throws ClientNotFountException{
	 * 
	 * try { List<Client> clients = clientRepository.findAll(); return clients; }
	 * catch (Exception e) { throw new
	 * ClientNotFountException(" Client Details not found"); }
	 * 
	 */ public List<Client> getClientListBasedOnName(String name) {
		List<Client> clients = clientRepository.findByNameContainingIgnoreCase(name);

		return clients;
	}

//    @Override
//    public Client addClientDetails() {
//         return  null;
//    }

}
