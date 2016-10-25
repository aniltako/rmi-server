package com.fuse.service;

import java.util.List;

import com.fuse.domain.User;

public interface IRMIUserService {
	
	User addUser(User user);
	User deleteUser(String id);
	List<User> getAllUsers();
	

}
