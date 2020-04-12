package com.abhi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.entity.Subject;



/**
 * @author ravi
 *
 */
@Transactional
@Repository
public class SubjectDao implements ISubjectDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> getSubjects(Integer subId) {
		String sql = "FROM Subject s ";
		if(subId != null)
			sql += " where s.subId = :subId";
		Query query = entityManager.createQuery(sql);
		if(subId != null)
			query.setParameter("subId", subId);
		return (List<Subject>)query.getResultList();
	}
	@Override
	@Transactional(readOnly=false)
	public Subject saveSubject(Subject subject) {
		entityManager.persist(subject);
		return subject;
	}

	@Override
	@Transactional(readOnly=false)
	public Subject updateSubject(Subject subject) {
		entityManager.merge(subject);
		return subject;
	}

}
