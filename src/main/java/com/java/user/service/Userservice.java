package com.java.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.java.user.model.User;
import com.java.user.repository.Userrepository;
@Service
public class Userservice {
	@Autowired
    private Userrepository userrepository;
	
	
	public void Register(User user) {
		List<User>list = userrepository.findByEmail(user.getEmail());
		if(list.size()!=0) {
			System.out.println("Already email is registered");
		}
		else {
		User user1 = new User();
		user1.setName(user.getName());
		user1.setDob(user.getDob());
		user1.setGender(user.getGender());
		user1.setAddress(user.getAddress());
		user1.setEmail(user.getEmail());
		user1.setMobile(user.getMobile());
		userrepository.save(user);
		}
		
	}
	public List<User> findByEmail(String email) {
		return userrepository.findByEmail(email);
		
	}
	public User findByUserNameandPassword(String name, String password) {
		return userrepository.findByUserNameandPassword(name,password);
	}
	public User findByEmailandPassword(String email,String password) {
		return userrepository.findByEmailandPassword(email,password);    
	}
	public void Login(String name, String password) {
		User userinfo = userrepository.findByUserNameandPassword(name, password);
		if(userinfo!=null) {
		if(name.equalsIgnoreCase(userinfo.getName())&&password.equals(userinfo.getPassword())){
			System.out.println("logged in successfully");
		}else {
			System.out.println("invalid credidentials");
		}
		}else {
			System.out.println("invalid account create new account");
		}
		
	}
	public User Loginbymailid(User user) {
		User userobj = null;

		try {
		String emailid = user.getEmail();
		String pass = user.getPassword();
		if(emailid!=null && pass!=null) {
			userobj = userrepository.findByEmailandPassword(emailid, pass);
			
		}
		}catch(Exception e) {
			System.out.println("invalid credentials");
		
		}
		return userobj;

	}
		
		
		
	}


