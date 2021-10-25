package com.example.loginpage.peerreview.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.peerreview.entity.PeerReview;
//import com.example.loginpage.inprogress.entity.InProgress;
//import com.example.loginpage.inprogressrepository.InProgressRepository;
import com.example.loginpage.peerreview.entity.PeerReview.*;
import com.example.loginpage.peerreview.repository.*;

@RestController
@RequestMapping("/peerreview/")
public class PeerReviewController {
	@Autowired
	PeerReviewRepository pRepository;
	@PostMapping("PeerReview")
	public PeerReview peerreviewsave(@RequestBody PeerReview peer) {
	
		System.out.println(peer);
		
		return pRepository.save(peer) ;
	}
}