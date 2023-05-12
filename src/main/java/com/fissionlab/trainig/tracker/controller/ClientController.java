package com.fissionlab.trainig.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fissionlab.trainig.tracker.DTO.ClientDTO;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.service.impl.ClientServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(EndPointConfig.API_V1)
@Slf4j
public class ClientController {

	@Autowired
	private ClientServiceImpl clientService;

	@PostMapping("/create/client")
	public String createClient(@RequestBody ClientDTO clientDTO, HttpServletRequest request) {
		Client client = clientService.createClient(clientDTO, request);
		return "client details saved successfully" + client.getId();
	}

	@PostMapping("/create/client/manager")
	public String createClientWithmanager(@RequestBody ClientDTO clientDTO, HttpServletRequest request) {
		Client client = clientService.createClientWithManger(clientDTO, request);
		return "client details saved successfully" + client.getId();
	}

	@GetMapping("/clients/{clientId}")
	public ResponseEntity<ClientDTO> getClientById(@PathVariable String clientId) throws Exception {
		ClientDTO clientDTO = clientService.getClientById(clientId);
		try {
			if (clientDTO == null) {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			// Log the exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(clientDTO);
	}

	@PutMapping("/clients/{clientId}")
	public String updateClientStatusById(@RequestBody ClientDTO clientDTO, @PathVariable("clientId") String id) {
		String updated = clientService.updateClientById(clientDTO.getStatus(), id);

		log.info(clientDTO.getStatus() + "    " + id);

		return updated;

	}

}
