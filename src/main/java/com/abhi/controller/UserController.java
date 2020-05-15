package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Student;
import com.abhi.entity.User;
import com.abhi.service.IUserService;

@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(path = { "/users" })
	public List<User> getUsers() {
		List<User> users = userService.getUsers(null);
		return users;
	}

	@GetMapping(path = { "/users/{userId}" })
	public List<User> getUsers(@PathVariable("userId") Integer userId) {
		List<User> users = userService.getUsers(userId);
		return users;
	}

	@PostMapping(path = { "/users" })
	public User saveUser(@RequestBody User user) {
		User userR = userService.saveUser(user);
		return userR;
	}

	@PutMapping(path = { "/users" })
	public User updateUser(@RequestBody User user) {
		User userR = userService.updateUser(user);
		return userR;
	}

	@DeleteMapping(path = { "/users" })
	public User deleteUser(@RequestBody User user) {
		User userR = userService.deleteUser(user);
		return userR;
	}

}