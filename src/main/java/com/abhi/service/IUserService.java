package com.abhi.service;

import java.util.List;

import com.abhi.entity.User;

public interface IUserService {

	List<User> getUsers(Integer userId);

	User saveUser(User user);

	User updateUser(User user);
	
	User deleteUser(User user);
}
