package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Student;
import com.abhi.service.IStudentService;

/**
 * @author ravi
 *
 */
@RestController
@RequestMapping("api")
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping(path = {"/students"})
	public List<Student> getStudents() {
		List<Student> students = studentService.getStudents(null);
		return students;
	}
	@GetMapping(path = {"/students/{studId}"})
	public List<Student> getStudent(@PathVariable("studId") Integer studId) {
		List<Student> students = studentService.getStudents(studId);
		return students;
	}
	@PostMapping(path = {"/students"})
	public Student saveStudent(@RequestBody Student student) {
		Student studentR = studentService.saveStudent(student);
		return studentR;
	}
	@PutMapping(path = {"/students"})
	public Student updateStudent(@RequestBody Student student) {
		Student studentR = studentService.updateStudent(student);
		return studentR;
	}
	@DeleteMapping(path = {"/students"})
	public Student deleteStudent(@RequestBody Student student) {
		Student studentR = studentService.deleteStudent(student);
		return studentR;
	}

}
