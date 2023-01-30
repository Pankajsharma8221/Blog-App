package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.User;
import com.masai.service.Userserviceimpl;

@RestController
public class UserController {

	
	@Autowired
	Userserviceimpl service;
	
	@PostMapping("/saveuser")
	public ResponseEntity<User> saveuserHandler(@RequestBody User user){
		
		User saveuser=service.Registration(user);
		
		return new ResponseEntity<User>(saveuser, HttpStatus.OK);
		
	}
	
}
