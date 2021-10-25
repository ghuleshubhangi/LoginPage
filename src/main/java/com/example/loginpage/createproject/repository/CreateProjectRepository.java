package com.example.loginpage.createproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.createproject.CreateProject;
@Repository
public interface CreateProjectRepository extends JpaRepository<CreateProject, Integer> {

}
