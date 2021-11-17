package com.example.democrud.persistence.repository;

import com.example.democrud.persistence.entity.UserAtm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAtmRepo extends JpaRepository<UserAtm, Long> {
   
}
