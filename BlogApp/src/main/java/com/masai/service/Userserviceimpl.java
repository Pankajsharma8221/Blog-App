package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.UserRepo;
import com.masai.entity.User;
@Service
public class Userserviceimpl implements UserServicelayer{
 @Autowired
	UserRepo userep;
	
	@Override
	public User Registration(User user) {
		
		return userep.save(user);
	}

}
