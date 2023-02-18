package com.po.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.po.model.User;
import com.po.repo.UserRepo;
import com.po.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public boolean loginUser(User user) {
		
		User userExists=userRepo.findByUsername(user.getUsername());
		
		if (userExists == null) {
			return false;
		}
		else {
			String password = userExists.getPassword();
			if (user.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		
	}

}
