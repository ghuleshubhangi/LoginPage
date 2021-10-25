package com.example.loginpage.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.loginpage.peerreview.entity.PeerReview;
import com.example.loginpage.test.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}

