package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.dao.IStudentDao;
import com.abhi.entity.Student;



/**
 * @author ravi
 *
 */
@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao studentDao;

	@Override
	public List<Student> getStudents(Integer studId) {
		return studentDao.getStudents(studId);
	}

}
