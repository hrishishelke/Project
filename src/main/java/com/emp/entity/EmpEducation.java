package com.emp.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "emp_education")
public class EmpEducation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;

	@NotBlank(message = "Type is mandatory")
	private String type;
	
	@NotBlank(message = "Type is mandatory")
	private String grade_value;
	
	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date startdate;
	
	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date enddate;
	
	@NotBlank(message = "Type is mandatory")
	@Pattern(regexp="^[A-Za-z]")
	private String grade_university;
	
	@NotBlank(message = "Type is mandatory")
	@Pattern(regexp="^[A-Za-z]")
	private String grade_institution;
	
	@NotBlank(message = "Type is mandatory")
	@Pattern(regexp="^[A-Za-z]")
	private String school_name;
	
	@NotBlank(message = "Type is mandatory")
	private String percentage;
	
	private String curriculum;
	

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	
	
	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGrade_value() {
		return grade_value;
	}

	public void setGrade_value(String grade_value) {
		this.grade_value = grade_value;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getGrade_university() {
		return grade_university;
	}

	public void setGrade_university(String grade_university) {
		this.grade_university = grade_university;
	}

	public String getGrade_institution() {
		return grade_institution;
	}

	public void setGrade_institution(String grade_institution) {
		this.grade_institution = grade_institution;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
