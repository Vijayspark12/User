package com.java.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.user.constants.AppConstant;
import com.java.user.model.User;
import com.java.user.service.Userservice;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController(value = AppConstant.USER_CONTROLLER)
public class Usercontroller {
	@Autowired
	private Userservice userservice;
	
	@PostMapping(value = AppConstant.REGISTER)
	public void Register(@RequestBody User user) {
		userservice.Register(user);
	}
	@GetMapping(value = AppConstant.FIND_BY_EMAIL)
	public @ResponseBody List<User> findByEmail(String email) {
		return userservice.findByEmail(email);
	}
	@GetMapping(value = AppConstant.FIND_BY_USERANDPASSWORD)
	public @ResponseBody User findByUserNameandPassword(String name,String password) {
		return userservice.findByUserNameandPassword(name,password);
	}
	@GetMapping(value = AppConstant.FINDBYEMAILANDPASSWORD)
	public @ResponseBody User findByEmailandPassword(String email,String password) {
		return userservice.findByEmailandPassword(email, password);
	}
	
	@PostMapping(value = AppConstant.LOGIN)
	public void Loginbyuserid(@RequestParam("name") String name ,@RequestParam("password") String password) {
		userservice.Login(name,password);
	}
	@PostMapping(value = AppConstant.LOGINBYMAILID)
	public User Loginbymailid(@RequestBody User user){
		return userservice.Loginbymailid(user);
	}

}
