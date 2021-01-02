package com.emp.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Pattern(regexp="^[A-Za-z0-9]")
	private int emp_code;

	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String emp_first_name;
	
	@Pattern(regexp="^[A-Za-z]")
	private String emp_middle_name;

	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String emp_last_name;

	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String emp_blood_group;

	@NotNull
	@Pattern(regexp="^[0-9]")
	private int age;
	
	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date emp_dob;

	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String emp_gender;

	@NotNull
	@Pattern(regexp="^(0[1-9]|1[012])[/ ](0[1-9]|[12][0-9]|3[01])[ /](19|20)\\d\\d",message="DD/MM/YYYY")
	private Date emp_join_date;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String nationality;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String religion;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String caste;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String lang_known;
	
	@Pattern(regexp="^[A-Za-z]")
	private String mother_tongue;
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]")
	private String mariatal_status;  
	
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
	private String Role;
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private List<EducationalGap> educationalGaps = new ArrayList<EducationalGap>();
	
	@OneToOne(mappedBy = "employee",fetch= FetchType.LAZY,cascade =CascadeType.REMOVE)
	private EmpBasicDetails empBasicDetails;
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private List<EmpContact> empContact = new ArrayList<EmpContact>();
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private List<EmpEducation> empEducation = new ArrayList<EmpEducation>();
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private List<EmpIdentifier> empIdentifier = new ArrayList<EmpIdentifier>();
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private List<WorkExperience> workExperience = new ArrayList<WorkExperience>();
	
	
	

	public List<EmpContact> getEmpContact() {
		return empContact;
	}

	public void setEmpContact(List<EmpContact> empContact) {
		this.empContact = empContact;
	}

	public List<EmpEducation> getEmpEducation() {
		return empEducation;
	}

	public void setEmpEducation(List<EmpEducation> empEducation) {
		this.empEducation = empEducation;
	}

	public List<EmpIdentifier> getEmpIdentifier() {
		return empIdentifier;
	}

	public void setEmpIdentifier(List<EmpIdentifier> empIdentifier) {
		this.empIdentifier = empIdentifier;
	}

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}

	public List<EducationalGap> getEducationalGaps() {
		return educationalGaps;
	}

	public void setEducationalGaps(List<EducationalGap> educationalGaps) {
		this.educationalGaps = educationalGaps;
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
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public EmpBasicDetails getEmpBasicDetails() {
		return empBasicDetails;
	}

	public void setEmpBasicDetails(EmpBasicDetails empBasicDetails) {
		this.empBasicDetails = empBasicDetails;
	}
	
	

}
