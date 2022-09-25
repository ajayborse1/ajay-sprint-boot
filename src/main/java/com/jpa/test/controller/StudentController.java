package com.jpa.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.model.Student;
import com.jpa.test.model.User;
import com.jpa.test.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@GetMapping("stuent/getStudent/{id}/{name}")
	public ArrayList<Student> getStudent(@PathVariable("id") Integer id,@PathVariable("name") String name) {
		System.out.println("in student method");
		return studentservice.getStudent(id , name);
		
	}
	@GetMapping("student/getStudent")
	public ArrayList<Student> getStudentByRqestParam(@RequestParam("Id") Integer id,@RequestParam("studentName") String name) {
		System.out.println("RequestParam:"+name);
		System.out.println("Id:"+id);
		
		return studentservice.getStudent(id, name);
   }
	
	@PostMapping("student/saveStudent")
	public Student saveStudent(@RequestBody Student studentObject){
		return studentservice.saveStudent(studentObject);
		
	}
	
	@PutMapping("stuent/updateStudent")
	public Student putStudent(@RequestBody Student studentObject){
		return studentservice.saveStudent(studentObject);
		
	}
	
}
