package com.mindfull.ptest.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfull.ptest.Repository.userRepository;
import com.mindfull.ptest.model.User;
import com.mindfull.ptest.service.userService;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	userRepository userRepo;

	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User getUser(String userId) {
		User user=userRepo.findById(userId).get();
		
		return user;
	}

}
