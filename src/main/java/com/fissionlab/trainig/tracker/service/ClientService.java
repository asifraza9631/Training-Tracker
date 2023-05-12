package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.DTO.ClientDto;
import com.fissionlab.trainig.tracker.entity.Client;
import jakarta.servlet.http.HttpServletRequest;

public interface ClientService {


       public Client createClientWithManger(ClientDto clientDTO, HttpServletRequest request);
       public Client createClient(ClientDto clientDTO, HttpServletRequest request);

       public ClientDto getClientById(String id, HttpServletRequest request) throws Exception;

       public String updateClientById(String id, String status);



}
