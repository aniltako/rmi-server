package com.fuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fuse.domain.User;
import com.fuse.service.IRMIUserService;

@RestController
public class UserController {
	
	@Autowired
	IRMIUserService userService;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		
		return userService.getAllUsers();
		
	}

}
