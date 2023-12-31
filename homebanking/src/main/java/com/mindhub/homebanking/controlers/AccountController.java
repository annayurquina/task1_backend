package com.mindhub.homebanking.controlers;

import com.mindhub.homebanking.dtos.AccountDTO;
import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/api/accounts")
    public List<AccountDTO> getAccounts() {
        return accountRepository.findAll().stream().map(account -> new AccountDTO(account)).collect(toList());
    }
}
