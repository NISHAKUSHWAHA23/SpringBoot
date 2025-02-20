package com.spring.main.services;

import com.spring.main.entities.User;

public interface UserService 
{
	public boolean registerUser(User user);
		public User loginUser(String email,String password);
	

}
