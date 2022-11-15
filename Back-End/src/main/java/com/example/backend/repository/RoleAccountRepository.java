package com.example.backend.repository;

import com.example.backend.model.RoleAccount;
import com.example.backend.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleAccountRepository extends JpaRepository<RoleAccount, Integer> {
    Optional<RoleAccount> findByNameRoleAccount(RoleName name);
}
