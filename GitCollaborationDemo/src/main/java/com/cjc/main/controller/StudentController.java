package com.cjc.main.controller;

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
	
}
