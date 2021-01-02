package com.emp.model;

import java.sql.Date;

public class EmpEducationModel {

	
	private int id;
	private String type;
	private String grade_value;
	private Date startdate;
	private Date enddate;
	private int emp_id;
	private String grade_university;
	
	
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
	private String grade_institution;
    private String school_name;
	private String percentage;
	private String curriculum;
	
	

	private int employeeId;
    
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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
    
    
}
