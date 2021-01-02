package com.emp.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "emp_basic_details")
public class EmpBasicDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String emp_marrital_status;

	// private int emp_id;
	@NotNull
	private String highest_qualification;

	@OneToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_marrital_status() {
		return emp_marrital_status;
	}

	public void setEmp_marrital_status(String emp_marrital_status) {
		this.emp_marrital_status = emp_marrital_status;
	}

	public String getHighest_qualification() {
		return highest_qualification;
	}

	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
