package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.dao.ISubjectDao;
import com.abhi.entity.Subject;



/**
 * @author ravi
 *
 */
@Service
public class SubjectServiceImpl implements ISubjectService {
	
	@Autowired
	private ISubjectDao subjectDao;

	@Override
	public List<Subject> getSubjects(Integer subId) {
		return subjectDao.getSubjects(subId);
	}
	@Override
	@Transactional(readOnly=false)
	public Subject saveSubject(Subject subject) {
		return subjectDao.saveSubject(subject);
	}

	@Override
	@Transactional(readOnly=false)
	public Subject updateSubject(Subject subject) {
		return subjectDao.updateSubject(subject);
	}

}
