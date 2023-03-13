package com.greatlearning.employee.email.model;

  public class Employee 
{
	private String firstname;
	private String lastname;
	private String department;
	private String emailaddress;
	private String password;
	public Employee(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
