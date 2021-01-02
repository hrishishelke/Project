package com.emp.entity;

import java.io.Serializable;

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
@Table(name = "emp_contact")
public class EmpContact implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String contact_type;
	
	@NotNull
	@Pattern(regexp="(\\+61|0)[0-9]{9}")
	private String contact_value;
	
	@NotNull
	@Pattern(regexp="^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\"+ \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")
	private String email;
	
	@NotNull
	@Pattern(regexp="^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\"+ \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")
	private String alternate_email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlternate_email() {
		return alternate_email;
	}

	public void setAlternate_email(String alternate_email) {
		this.alternate_email = alternate_email;
	}


	
	// private int emp_id;

	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContact_type() {
		return contact_type;
	}

	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}

	public String getContact_value() {
		return contact_value;
	}

	public void setContact_value(String contact_value) {
		this.contact_value = contact_value;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
