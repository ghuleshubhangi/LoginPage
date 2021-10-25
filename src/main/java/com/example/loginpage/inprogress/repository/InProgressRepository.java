package com.example.loginpage.inprogress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.loginpage.backlog.entity.Backlog;
import com.example.loginpage.inprogress.entity.InProgress;

@Repository
public interface InProgressRepository extends JpaRepository<InProgress, Integer> {

}
