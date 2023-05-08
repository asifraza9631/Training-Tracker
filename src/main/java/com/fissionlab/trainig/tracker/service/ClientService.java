package com.fissionlab.trainig.tracker.service;

import com.fissionlab.trainig.tracker.DTO.ClientDTO;
import com.fissionlab.trainig.tracker.entity.Client;
import jakarta.servlet.http.HttpServletRequest;

public interface ClientService {


       public Client createClientWithManger(ClientDTO clientDTO, HttpServletRequest request);
       public Client createClient(ClientDTO clientDTO, HttpServletRequest request);

       public ClientDTO getClientById(String id, HttpServletRequest request) throws Exception;

       public String updateClientById(String id, String status);



}
