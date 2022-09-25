package com.jpa.test.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.model.User;
import com.jpa.test.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("user/getdata/{id}/{city}")
	public ArrayList<User> getUser1 ( @PathVariable ("id") Integer id, @PathVariable ("city") String city){
		return userService.getUser1(id);
		
	}
	@GetMapping("user/getdata")
	public ArrayList<User> getUser1(int id) {
		
	return  userService.getUser1(id) ;
	
	}
	@GetMapping("/getdata")
	public String getUserByName() {
	
//		User user2=userRepository.findUeryByName(1);
//		System.out.println("Second user:");
//		System.out.println(user2);
	   return "user data";
	}

	
}
