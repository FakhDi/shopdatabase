package com.fakhrullina.shopdatabase.controllers;

import com.fakhrullina.shopdatabase.entity.Client;
import com.fakhrullina.shopdatabase.interfaces.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/Client")
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

}
