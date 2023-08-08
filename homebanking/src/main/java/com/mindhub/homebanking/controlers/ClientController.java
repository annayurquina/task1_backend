package com.mindhub.homebanking.controlers;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository repoClient;

    @RequestMapping("/api")
    public List<Client> getAll() {
        return repoClient.findAll();
    }
}
