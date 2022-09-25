package com.jpa.test.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.model.Student;
import com.jpa.test.model.User;
import com.jpa.test.service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{
	@Autowired
	StudentRepository st;
  public ArrayList<Student> getStudent(Integer id , String name) {
	  Student student= st.findByNo(id , name);
	  System.out.println("User: ");
	  System.out.println(student);
	  
  
//  Student student1= st.findByNo(1);
//  System.out.println("User: ");
//  System.out.println(student1);
  ArrayList<Student> al1=new ArrayList<Student>();
//  al1.add(student1);
  al1.add(student);
  
return al1;
  
  }
  
  public Student saveStudent(Student studentservice) {
	  System.out.println("Inside save Student method");
	 return st.save(studentservice);
  }
}
