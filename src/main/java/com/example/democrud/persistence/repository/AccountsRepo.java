package com.example.democrud.persistence.repository;

import com.example.democrud.persistence.entity.Accounts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Long> {
   
}
