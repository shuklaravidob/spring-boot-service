package com.abhi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.abhi.entity.Student;



/**
 * @author ravi
 *
 */
@Transactional
@Repository
public class StudentDao implements IStudentDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents(Integer studId) {
		String sql = "FROM Student s ";
		if(studId != null)
			sql += " where s.studId = :studId";
		Query query = entityManager.createQuery(sql);
		if(studId != null)
			query.setParameter("studId", studId);
		return (List<Student>)query.getResultList();
	}

	@Override
	@Transactional(readOnly=false)
	public Student saveStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	@Transactional(readOnly=false)
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

}
