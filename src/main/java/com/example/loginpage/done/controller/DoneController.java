package com.example.loginpage.done.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.done.entity.Done;
import com.example.loginpage.done.repository.DoneRepository;
//import com.example.loginpage.peerreview.entity.PeerReview;
//import com.example.loginpage.peerreview.repository.PeerReviewRepository;

@RestController
@RequestMapping("/done/")
public class DoneController {
	@Autowired
	DoneRepository dRepository;
	@PostMapping("Done")
	public Done donesave(@RequestBody Done Dsave) {
	
		System.out.println(Dsave);
		
		return dRepository.save(Dsave) ;
	}
}