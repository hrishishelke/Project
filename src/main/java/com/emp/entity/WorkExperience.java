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
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "work_identifier")
public class WorkExperience implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Pattern(regexp="^[A-Za-z]")
	private String organization_name;
	
	@Pattern(regexp="^[A-Za-z]")
	private String designation;
	
	@Pattern(regexp="^[A-Za-z]")
	private String work_experience;
	
	@Pattern(regexp="^[0-9]",message="In years")
	private int duration_in_year;
	
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date start_date;
	
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date end_date;
	
	@Pattern(regexp="^[A-Za-z]")
	private String location;
	
	@Pattern(regexp="^[A-Za-z]")
	private String reason_for_change;
	
	@Pattern(regexp="^[0-9]")
	private String gross_sal;
	// private int emp_id;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	

	public String getGross_sal() {
		return gross_sal;
	}

	public void setGross_sal(String gross_sal) {
		this.gross_sal = gross_sal;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
