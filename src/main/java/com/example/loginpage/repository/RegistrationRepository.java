package com.example.loginpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.entity.RegistrationEntity;
@Repository

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
RegistrationEntity findByEmail(String email);
}
