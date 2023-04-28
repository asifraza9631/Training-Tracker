package com.fissionlab.trainig.tracker.service.impl;

import com.fissionlab.trainig.tracker.entity.Client;
import com.fissionlab.trainig.tracker.repository.ClientRepository;
import com.fissionlab.trainig.tracker.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService {
     @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client addClientDetails() {
         return  null;
    }
}
