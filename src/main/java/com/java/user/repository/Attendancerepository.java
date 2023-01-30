package com.java.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.user.model.Attendance;
@Repository
public interface Attendancerepository extends JpaRepository<Attendance, Long>{

}
