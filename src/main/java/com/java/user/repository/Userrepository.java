package com.java.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.user.model.User;
@Repository
public interface Userrepository extends JpaRepository<User, Long>{
    @Query("from User where email=:email")
	List<User> findByEmail(String email);
    
    @Query("from User where name=:name and password=:password")
	User findByUserNameandPassword(String name, String password);
    
    @Query("from User where email=:email and password=:password")
	User findByEmailandPassword(String email, String password);

}
