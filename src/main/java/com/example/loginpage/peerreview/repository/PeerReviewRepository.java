package com.example.loginpage.peerreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.loginpage.inprogress.entity.InProgress;
import com.example.loginpage.peerreview.entity.PeerReview;


@Repository
public interface PeerReviewRepository extends JpaRepository<PeerReview, Integer> {

	//PeerReview post(PeerReview psave);

}
