package com.example.backend.service;

import com.example.backend.model.RoleAccount;
import com.example.backend.model.RoleName;
import com.example.backend.repository.RoleAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleAccountServiceImpl implements RoleAccountService{
    @Autowired
    RoleAccountRepository repository;

    @Override
    public Optional<RoleAccount> findByName(RoleName name) {
        return repository.findByNameRoleAccount(name);
    }
}
