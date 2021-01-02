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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "educational_gap")
public class EducationalGap implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date start_date;
	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[ /](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date end_date;
	
	private String reason;

	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
