package com.emp.model;

public class EmpBasicDetailsModel {
private int id;
	
	private String emp_marrital_status;
	
	//private int emp_id;
	
	private String highest_qualification;
	
	private static int employeeId;
		

	public static int getEmployeeId() {
		return employeeId;
	}

	public static void setEmployeeId(int employeeId) {
		EmpBasicDetailsModel.employeeId = employeeId;
	}

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

	}

	


