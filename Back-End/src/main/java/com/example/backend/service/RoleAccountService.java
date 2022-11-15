package com.example.backend.service;

import com.example.backend.model.RoleAccount;
import com.example.backend.model.RoleName;

import java.util.Optional;

public interface RoleAccountService {
    Optional<RoleAccount> findByName(RoleName name);
}
