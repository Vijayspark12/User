package com.java.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.user.constants.AppConstant;
import com.java.user.model.Student;

import com.java.user.service.Studentservice;
//@RestController(value = AppConstant.STUDENT_CONTROLLER)
@Controller
public class StudentController {
	@Autowired
	private Studentservice studentservice;
	
	@PostMapping(value = AppConstant.SAVE)
	public void save(@RequestBody Student student) {
		studentservice.save(student);
	}
	@GetMapping(value = AppConstant.HOME)
	public String home(String name,Model model) {
		 name = "vijayvfx";
		model.addAttribute("name",name);
		return "home";
	}
	
	

}
