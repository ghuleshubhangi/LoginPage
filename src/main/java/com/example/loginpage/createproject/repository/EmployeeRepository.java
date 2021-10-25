package com.example.loginpage.createproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.createproject.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
