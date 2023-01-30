package com.java.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.user.model.Student;
@Repository
public interface Studentrepository extends JpaRepository<Student, Long>{

}
