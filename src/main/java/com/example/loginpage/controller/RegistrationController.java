package com.example.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.entity.RegistrationEntity;
import com.example.loginpage.service.RegistrationService;


@RestController
@RequestMapping("/api/login/")
@CrossOrigin(origins="http://localhost:4200")
public class RegistrationController {
	@Autowired
	RegistrationService rService;
	
	//http:localhost:8080/api/login/registration
	@PostMapping("/registration")
	
	public RegistrationEntity registrationForm(@RequestBody RegistrationEntity registrationEntity) {
		
		return rService.saveRegistrationService(registrationEntity) ;
	}
	
		
	/*@PostMapping("/loginform/{email}/{password}")
	public String loginform(@PathVariable("email")String email,@PathVariable("password")String password ) {
		return rService.loginservice(email,password);
	}*/
	@PostMapping("/loginform")
	public String loginform(@RequestBody  RegistrationEntity registrationEntity) {
		return rService.loginservice( registrationEntity.getEmail(),registrationEntity.getPassword());
	}
}
