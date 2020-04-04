package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Subject;
import com.abhi.service.ISubjectService;

/**
 * @author ravi
 *
 */
@RestController
@RequestMapping("api")
public class SubjectController {
	
	@Autowired
	private ISubjectService subjectService;
	
	@GetMapping(path = {"/subjects"})
	public List<Subject> getSubjects() {
		List<Subject> subjects = subjectService.getSubjects(null);
		return subjects;
	}
	
	@GetMapping(path = {"/subjects/{subId}"})
	public List<Subject> getStudent(@PathVariable("subId") Integer subId) {
		List<Subject> subjects = subjectService.getSubjects(subId);
		return subjects;
	}

}
