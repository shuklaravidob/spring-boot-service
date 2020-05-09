package com.abhi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.entity.Student;
import com.abhi.entity.User;

@Transactional
@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers(Integer userId) {
		String sql = "FROM User s ";
		if (userId != null)
			sql += " where s.userId = :userId";
		Query query = entityManager.createQuery(sql);
		if (userId != null)
			query.setParameter("userId", userId);
		return (List<User>) query.getResultList();
	}

	@Override
	@Transactional(readOnly = false)
	public User saveUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	@Transactional(readOnly = false)
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(User user) {
		String sql = "delete from User s where s.UserId = :UserId";
		entityManager.createQuery(sql).setParameter("UserId", user.getUserId()).executeUpdate();
		return user;
	}

}