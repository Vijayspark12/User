package com.java.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.java.user.model.Student;
import com.java.user.repository.Studentrepository;
@Service
public class Studentservice {
	@Autowired
	private Studentrepository studentrepository;
	
	public void save(Student student) {
	Student student1 = new Student();
	student1.setFirstname(student.getFirstname());
	student1.setLastname(student.getLastname());
	student1.setGender(student.getGender());
	student1.setEmail(student.getEmail());
	student1.setCourse(student.getCourse());
	student1.setDOB(student.getDOB());
	studentrepository.save(student);
	}

}
