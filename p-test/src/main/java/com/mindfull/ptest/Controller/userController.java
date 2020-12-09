package com.mindfull.ptest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindfull.ptest.model.User;
import com.mindfull.ptest.service.userService;

@CrossOrigin(origins = {"http://localhost:3000"} )
@RequestMapping(value="/user")

@RestController
public class userController {
	
	@Autowired
	userService userServ;
	
	@GetMapping("/userId/{userId}")
	public User getUser(@PathVariable String userId) {
		return userServ.getUser(userId);
	}
	
	@RequestMapping (value="/", method=RequestMethod.POST)
	public User addNewClient(@RequestBody User user ) {
		return userServ.createUser(user);
	}
	
	

}
