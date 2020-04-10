package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.dao.IStudentDao;
import com.abhi.entity.Student;



/**
 * @author ravi
 *
 */
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao studentDao;

	@Override
	public List<Student> getStudents(Integer studId) {
		return studentDao.getStudents(studId);
	}

	@Override
	@Transactional(readOnly=false)
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	@Transactional(readOnly=false)
	public Student updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

}
