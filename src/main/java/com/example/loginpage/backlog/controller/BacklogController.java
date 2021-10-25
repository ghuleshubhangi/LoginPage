package com.example.loginpage.backlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.backlog.entity.Backlog;
import com.example.loginpage.backlog.repository.*;
import com.example.loginpage.backlog.controller.*;
@RestController
@RequestMapping("/backlog/")
public class BacklogController {
	@Autowired
	 BacklogRepository bRepository;
	@PostMapping("Backlog")
	public Backlog backlogsave(@RequestBody Backlog bsave) {
	
		System.out.println(bsave);
		
		return bRepository.save(bsave) ;
	}
}