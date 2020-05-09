package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.dao.IUserDao;
import com.abhi.entity.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getUsers(Integer userId) {
		return userDao.getUsers(userId);
	}

	@Override
	@Transactional(readOnly = false)
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	@Transactional(readOnly = false)
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User deleteUser(User user) {
		return userDao.deleteUser(user);
	}

}