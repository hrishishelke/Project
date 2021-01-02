/**
 * 
 */
package com.emp.model;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author HP
 *
 */
public class EmployeeModel {

	private int id;

	@NotEmpty
	private int emp_code;

	@NotEmpty
	private String emp_first_name;

	private String emp_middle_name;

	private String emp_last_name;

	private String emp_blood_group;

	private int age;

	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date emp_dob;

	private String emp_gender;

	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date emp_join_date;
	
	private String nationality;
	
	private String religion;
	
	private String caste;
	
	private String lang_known;
	
	private String mother_tongue;
	
	private String mariatal_status;  
	
	private String role;
	
	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getLang_known() {
		return lang_known;
	}

	public void setLang_known(String lang_known) {
		this.lang_known = lang_known;
	}

	public String getMother_tongue() {
		return mother_tongue;
	}

	public void setMother_tongue(String mother_tongue) {
		this.mother_tongue = mother_tongue;
	}

	public String getMariatal_status() {
		return mariatal_status;
	}

	public void setMariatal_status(String mariatal_status) {
		this.mariatal_status = mariatal_status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}

	public String getEmp_first_name() {
		return emp_first_name;
	}

	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}

	public String getEmp_middle_name() {
		return emp_middle_name;
	}

	public void setEmp_middle_name(String emp_middle_name) {
		this.emp_middle_name = emp_middle_name;
	}

	public String getEmp_last_name() {
		return emp_last_name;
	}

	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}

	public String getEmp_blood_group() {
		return emp_blood_group;
	}

	public void setEmp_blood_group(String emp_blood_group) {
		this.emp_blood_group = emp_blood_group;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public String getEmp_gender() {
		return emp_gender;
	}

	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}

	public Date getEmp_join_date() {
		return emp_join_date;
	}

	public void setEmp_join_date(Date emp_join_date) {
		this.emp_join_date = emp_join_date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	

}
