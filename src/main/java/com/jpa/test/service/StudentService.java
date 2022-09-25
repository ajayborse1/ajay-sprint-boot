package com.jpa.test.service;
import java.util.ArrayList;
import com.jpa.test.model.Student;

public interface StudentService {
    public ArrayList<Student> getStudent(Integer id, String name);
    public Student saveStudent(Student id);
}
