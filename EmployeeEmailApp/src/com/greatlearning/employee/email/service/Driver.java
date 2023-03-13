package com.greatlearning.employee.email.service;

import com.greatlearning.employee.email.model.*;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner opt= new Scanner(System.in);
		String firstname=opt.next();
		String lastname=opt.next();
		Employee employee = new Employee(firstname,lastname);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = opt.nextInt();
		if(option >=1 && option<=4)
	{		
		switch(option) 
		{
		case 1: 
			  employee.setDepartment("Tech"); 
			  break;
		case 2:
			  employee.setDepartment("Adm");
			  break;
		case 3:
			  employee.setDepartment("HR");
			  break;
		case 4:
			  employee.setDepartment("Lgl");
			  break;
		}
	}
		else {
			System.out.println("Please enter valid input");
		}
		
		CredentialService cred = new CredentialServiceImp();
		
		String email =  cred.generateEmailAddress(employee);
		employee.setEmailaddress(email);
		String pass=cred.generatePassword();
		employee.setPassword(pass);
		System.out.println(cred.showCredentials(employee));

	}

}
