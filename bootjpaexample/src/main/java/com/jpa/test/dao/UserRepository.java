package com.jpa.test.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.jpa.test.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query(value="select * from user where id=?1",nativeQuery=true)
	public User findUserById(int id);

}
