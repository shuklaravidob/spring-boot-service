package com.abhi.service;

import java.util.List;

import com.abhi.entity.Student;



/**
 * @author ravi
 *
 */
public interface IStudentService {
	
	List<Student> getStudents(Integer studId);

}
