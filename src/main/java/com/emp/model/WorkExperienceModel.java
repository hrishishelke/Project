package com.emp.model;

import java.sql.Date;

public class WorkExperienceModel {

	
	
	private int id;
	private String organization_name;
	private String designation;
	private String work_experience;
	private int duration_in_year;
	private Date start_date;
	private Date end_date;
	private String location;
	private String reason_for_change;
	private int emp_id;
	private String gross_sal;
	
	

	public String getGross_sal() {
		return gross_sal;
	}
	public void setGross_sal(String gross_sal) {
		this.gross_sal = gross_sal;
	}
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
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getWork_experience() {
		return work_experience;
	}
	public void setWork_experience(String work_experience) {
		this.work_experience = work_experience;
	}
	public int getDuration_in_year() {
		return duration_in_year;
	}
	public void setDuration_in_year(int duration_in_year) {
		this.duration_in_year = duration_in_year;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReason_for_change() {
		return reason_for_change;
	}
	public void setReason_for_change(String reason_for_change) {
		this.reason_for_change = reason_for_change;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
}
