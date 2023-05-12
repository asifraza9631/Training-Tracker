package com.fissionlab.trainig.tracker.controller;

import com.fissionlab.trainig.tracker.DTO.ClientDto;
import com.fissionlab.trainig.tracker.config.EndPointConfig;
import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.service.impl.ClientServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndPointConfig.API_V1 + EndPointConfig.CLIENT)
@Tag(name = "client")
@Slf4j
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PostMapping()
    public String createClient(@RequestBody ClientDto clientDTO, HttpServletRequest request) {
        Client client = clientService.createClient(clientDTO, request);
        return "client details saved successfully" + client.getId();
    }

    @PostMapping("/manager")
    public String createClientWithmanager(@RequestBody ClientDto clientDTO, HttpServletRequest request) {
        Client client = clientService.createClientWithManger(clientDTO, request);
        return "client details saved successfully" + client.getId();
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDto> getClientById(@PathVariable String clientId, HttpServletRequest request) {
        try {
            ClientDto clientDTO = clientService.getClientById(clientId, request);
            if (clientDTO == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(clientDTO);
        } catch (Exception e) {
            // Log the exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{clientId}")
    public String updateClientStatusById(@RequestBody ClientDto clientDTO, @PathVariable("clientId") String id) {
        String updated = clientService.updateClientById(clientDTO.getStatus(), id);
        log.info(clientDTO.getStatus() + "    " + id);
        return updated;
    }

}
