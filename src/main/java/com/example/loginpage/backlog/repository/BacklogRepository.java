package com.example.loginpage.backlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.backlog.entity.Backlog;
import com.example.loginpage.createproject.CreateProject;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Integer> {

}
