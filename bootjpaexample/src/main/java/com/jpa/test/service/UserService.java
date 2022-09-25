package com.jpa.test.service;

import java.util.ArrayList;

import com.jpa.test.model.User;

public interface UserService {
	public ArrayList<User> getUser1(Integer id);
	public User getUser2(int id);
}