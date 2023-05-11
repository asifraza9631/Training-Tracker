package com.fissionlab.trainig.tracker.controller;

import java.util.Optional;

import com.fissionlab.trainig.tracker.DTO.ClientDTO;
import com.fissionlab.trainig.tracker.exception.CustomValidationException;
import com.fissionlab.trainig.tracker.repository.ClientRepository;
import com.fissionlab.trainig.tracker.utils.Validator;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.service.impl.ClientServiceImpl;

@RestController
@RequestMapping(EndPointConfig.API_V1)
@Slf4j
public class ClientController {

	@Autowired
	private ClientServiceImpl clientService;

	@Autowired
	private ClientRepository clientRepository;


	@PostMapping("/create/client")
	public  String createClient(@RequestBody @Validated ClientDTO clientDTO, HttpServletRequest request) {
		try {
			Validator.isValidateClient(clientDTO);
			Optional<Client> client = clientRepository.findById(clientDTO.getOrgId());
			if (client == null) {
				Client savedClient =  clientService.createClient(clientDTO, request);
				return "client details saved successfully" + savedClient.getId();
			}
		} catch (CustomValidationException e) {
			throw new RuntimeException(e);
		}
		return     "client already exists";
	}


	@PostMapping("/create/client/manager")
	public  String createClientWithmanager(@RequestBody ClientDTO clientDTO, HttpServletRequest request) {
		Client client =  clientService.createClientWithManger(clientDTO, request);
		return  "client details saved successfully" + client.getId();
	}


	@GetMapping("/clients/{clientId}")
	public ResponseEntity<ClientDTO> getClientById(@PathVariable String clientId, HttpServletRequest request) {
		try {
			ClientDTO clientDTO = clientService.getClientById(clientId, request);
			if (clientDTO == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(clientDTO);
		} catch (Exception e) {
			// Log the exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	      @PutMapping("/clients/{clientId}")
           public  String updateClientStatusById(@RequestBody ClientDTO clientDTO, @PathVariable("clientId") String id) {
		   String updated = clientService.updateClientById(clientDTO.getStatus(), id);

					log.info(clientDTO.getStatus() + "    " + id);

					   return  updated;

		   }




}
