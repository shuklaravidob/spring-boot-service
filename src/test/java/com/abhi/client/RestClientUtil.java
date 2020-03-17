package com.abhi.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.abhi.entity.Student;

public class RestClientUtil {
    public void getStudentByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/api/students/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Student> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Student.class, 1);
        Student student = responseEntity.getBody();
        System.out.println("Id:"+student.getStudId()+", FirstName:"+student.getFirstName()
                 +", LastName:"+student.getLastName());      
    }
	public void getAllArticlesDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/articles";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Student[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Student[].class);
        Student[] students = responseEntity.getBody();
        for(Student student : students) {
        	 System.out.println("Id:"+student.getStudId()+", FirstName:"+student.getFirstName()
             +", LastName:"+student.getLastName()); 
        }
    }
}
