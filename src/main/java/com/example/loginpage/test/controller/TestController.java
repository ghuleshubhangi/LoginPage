package com.example.loginpage.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.loginpage.peerreview.entity.PeerReview;
//import com.example.loginpage.peerreview.repository.PeerReviewRepository;
import com.example.loginpage.test.entity.Test;
import com.example.loginpage.test.repository.TestRepository;

@RestController
@RequestMapping("/testcontroller/")
public class TestController {
	@Autowired
	TestRepository tRepository;
	@PostMapping("Test")
	public Test testsave(@RequestBody Test Tsave) {
	
		System.out.println(Tsave);
		
		return tRepository.save(Tsave) ;
	}
}