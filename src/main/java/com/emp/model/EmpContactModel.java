package com.emp.model;

public class EmpContactModel {
	
	
	 private int  id;
		private String  contact_type;
		private String  contact_value;
		private String email;
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
		private int employeeId;
		//private int emp_id;
		public int getId() {
			return id;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
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
		

}
