package com.example.loginpage.inprogress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.loginpage.backlog.entity.Backlog;
//import com.example.loginpage.backlogrepository.backlogRepository;
import com.example.loginpage.inprogress.entity.InProgress;
import com.example.loginpage.inprogress.repository.*;
@RestController
@RequestMapping("/inprogress/")
public class InProgressController {
	@Autowired
	 InProgressRepository iRepository;
	@PostMapping("inprogress")
	public InProgress inprogresssave(@RequestBody InProgress Isave) {
	
		System.out.println(Isave);
		
		return iRepository.save(Isave) ;
	}
}