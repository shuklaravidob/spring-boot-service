package com.abhi.dao;

import java.util.List;
import com.abhi.entity.User;

public interface IUserDao {
	List<User> getUsers(Integer userId);

	User saveUser(User user);

	User updateUser(User user);

	User deleteUser(User user);
}