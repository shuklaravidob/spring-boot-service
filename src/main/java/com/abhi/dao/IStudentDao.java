package com.abhi.dao;

import java.util.List;

import com.abhi.entity.Student;


/**
 * @author ravi
 *
 */
public interface IStudentDao {
	
	List<Student> getStudents(Integer studId);

	Student saveStudent(Student student);

	Student updateStudent(Student student);
	
	Student deleteStudent(Student student);

}
