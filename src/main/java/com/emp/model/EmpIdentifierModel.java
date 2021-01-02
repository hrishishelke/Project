package com.emp.model;

import java.sql.Date;

public class EmpIdentifierModel {

	
	
	private int id;
	private String identity_type;
	private String identity_value;
	private int emp_id;
	private String identity_issued_by;
	private Date identity_issue_date;
	private Date identity_expiry_date;
	private String pan;
	private String pan_no;
	private String passport;
	private Date passport_expiry_date;
	private String Aadhar;
	private String Aadhar_no;
	
	
	
	

	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public Date getPassport_expiry_date() {
		return passport_expiry_date;
	}
	public void setPassport_expiry_date(Date passport_expiry_date) {
		this.passport_expiry_date = passport_expiry_date;
	}
	public String getAadhar() {
		return Aadhar;
	}
	public void setAadhar(String aadhar) {
		Aadhar = aadhar;
	}
	public String getAadhar_no() {
		return Aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		Aadhar_no = aadhar_no;
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
	public String getIdentity_type() {
		return identity_type;
	}
	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
	}
	public String getIdentity_value() {
		return identity_value;
	}
	public void setIdentity_value(String identity_value) {
		this.identity_value = identity_value;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getIdentity_issued_by() {
		return identity_issued_by;
	}
	public void setIdentity_issued_by(String identity_issued_by) {
		this.identity_issued_by = identity_issued_by;
	}
	public Date getIdentity_issue_date() {
		return identity_issue_date;
	}
	public void setIdentity_issue_date(Date identity_issue_date) {
		this.identity_issue_date = identity_issue_date;
	}
	public Date getIdentity_expiry_date() {
		return identity_expiry_date;
	}
	public void setIdentity_expiry_date(Date identity_expiry_date) {
		this.identity_expiry_date = identity_expiry_date;
	}
}
