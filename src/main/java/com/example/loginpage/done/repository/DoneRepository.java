package com.example.loginpage.done.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.done.entity.Done;
//import com.example.loginpage.inprogress.entity.InProgress;

@Repository
public interface DoneRepository extends JpaRepository<Done , Integer> {

}
