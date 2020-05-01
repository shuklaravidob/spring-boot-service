package com.abhi.dao;

import java.util.List;

import com.abhi.entity.Student;
import com.abhi.entity.Subject;


/**
 * @author ravi
 *
 */
public interface ISubjectDao {
	
	List<Subject> getSubjects(Integer subId);
    
	Subject saveSubject(Subject subject);

	Subject updateSubject(Subject subject);
	
	Subject deleteSubject(Subject subject);
}
