package com.cjc.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class StudentController {

	
	@PostMapping("/Student")
	public Student postMethodName(@RequestBody Student student) {
		System.out.println("This is Git Collaborators");
		
		return student;
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> exposeAllStudents()
	{
		return new ResponseEntity<List<Student>>
		          (Arrays.asList(new Student(1,"sagar","pune"),
		        		  new Student(2,"shubham","jalgoan"))
				, HttpStatus.OK);
		
	}
}
