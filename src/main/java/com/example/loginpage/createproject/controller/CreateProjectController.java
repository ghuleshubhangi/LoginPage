package com.example.loginpage.createproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.createproject.*;
import com.example.loginpage.createproject.repository.CreateProjectRepository;
@RestController
@RequestMapping("/createproject/")
public class CreateProjectController {
	@Autowired
	CreateProjectRepository rRepository;
	@PostMapping("createproject")
	public CreateProject cprojectsave(@RequestBody CreateProject cproject) {
	
		System.out.println(cproject);
		
		return rRepository.save(cproject) ;
	}
}
