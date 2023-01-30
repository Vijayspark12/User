package com.java.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.java.user.constants.Sqlconstant;
@Entity
@Table(name = Sqlconstant.ATTENDANCEINFO)
public class Attendance implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
	@Column(name = "date")
	private String date;
	@Column(name="absentorpresent")
	private String absentorpresent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAbsentorpresent() {
		return absentorpresent;
	}
	public void setAbsentorpresent(String absentorpresent) {
		this.absentorpresent = absentorpresent;
	}
	

}
