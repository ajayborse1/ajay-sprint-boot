package com.jpa.test.serviceImpl;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.model.User;
import com.jpa.test.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	public ArrayList<User> getUser1(Integer id) {
		User user1=userRepository.findUserById(id);
		System.out.println("First user:");
		System.out.println(user1);
		
		User user2=userRepository.findUserById(id);
		System.out.println("First user:");
		System.out.println(user2);
		ArrayList<User> al=new ArrayList<User>();
		al.add(user1);
		return al;
		
		}

	@Override
	public User getUser2(int id) {
		
		return null;
	}



}

	
