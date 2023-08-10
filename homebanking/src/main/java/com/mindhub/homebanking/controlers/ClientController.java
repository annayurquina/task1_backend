package com.mindhub.homebanking.controlers;

import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    /*@RequestMapping("/api/clients")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }*/
    @RequestMapping("/api/clients")
    public List<ClientDTO> getClients() {

        return clientRepository.findAll().stream().map(client -> new ClientDTO(client)).collect(toList());
    }

}
