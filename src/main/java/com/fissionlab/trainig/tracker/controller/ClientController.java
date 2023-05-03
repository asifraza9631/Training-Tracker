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
import com.fissionlab.trainig.tracker.exception.ClientNotFoundException;
import com.fissionlab.trainig.tracker.service.impl.ClientServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
public class ClientController {

	@Autowired
	private ClientServiceImpl clientService;

	/*
	 * @GetMapping(EndPointConfig.ORGANIZATION_CLIENT_DETAILS) public
	 * ResponseEntity<List<Client>> getAllclient() throws ClientNotFountException {
	 * List<Client> client = clientService.getAllClient();
	 * 
	 * if (client.isEmpty()) { return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
	 * else { return new ResponseEntity<>(client, HttpStatus.OK); }
	 * 
	 * }
	 */
	@GetMapping(EndPointConfig.ORGANIZATION_CLIENT_DETAILS_SEARCH)
	public ResponseEntity<List<Client>> seachClientBasedOnName(@RequestParam("query") String query)
			throws ClientNotFoundException {
		List<Client> skills = clientService.getClientListBasedOnName(query);

		if (skills.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(skills, HttpStatus.OK);
		}
	}

}
