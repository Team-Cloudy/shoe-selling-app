package com.example.backend.service;

import com.example.backend.model.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findByUsername(String username);
    Boolean existsByUsername(String username);
    Account save(Account account);
}
