package com.example.democrud.persistence.repository;

import com.example.democrud.persistence.entity.Atm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmRepo extends JpaRepository<Atm, Long> {
   
}