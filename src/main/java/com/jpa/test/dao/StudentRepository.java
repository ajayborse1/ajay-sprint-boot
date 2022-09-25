package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.model.Student;
import com.jpa.test.model.User;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
	  @Query(value="select * from student where roll_no=?1", nativeQuery=true)

	public Student findByNo(int roll_no, String name);
}
