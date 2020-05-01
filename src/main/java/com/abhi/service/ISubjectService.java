package com.abhi.service;

import java.util.List;

import com.abhi.entity.Subject;



/**
 * @author ravi
 *
 */
public interface ISubjectService {
	
	List<Subject> getSubjects(Integer subId);
    
	Subject saveSubject(Subject subject);

	Subject updateSubject(Subject subject);

	Subject deleteSubject(Subject subject);
}
