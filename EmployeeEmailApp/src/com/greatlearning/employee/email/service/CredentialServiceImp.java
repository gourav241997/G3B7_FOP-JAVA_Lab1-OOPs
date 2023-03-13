package com.greatlearning.employee.email.service;

import com.greatlearning.employee.email.model.*;

import java.util.Random;

public class CredentialServiceImp implements CredentialService
{
	public static final String COMPANY_DOMAIN="gl.in";
	public static final int PASSWORD_SIZE=8;

	@Override
	public String generateEmailAddress(Employee employee) {
		String firstname = employee.getFirstname();
		String lastname = employee.getLastname();
		String departmentname = employee.getDepartment();
		return firstname+lastname+"@"+departmentname+"."+COMPANY_DOMAIN;
	}

	@Override
	public String generatePassword() {
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = uppercase.toLowerCase();
		String num = "1234567890";
		String specialchars ="!@#$%&*";
		
		String password =uppercase+lowercase+num+specialchars;
		Random random=new Random();
		String str =" ";
		for (int i=0;i<PASSWORD_SIZE;i++)
		{
			str = str + password.charAt(random.nextInt(password.length()));
				
		}
		 return str;
			
	}
	@Override
	/*Dear Harshit your generated credentials are as follows
	Email ---> harshitchoudary@tech.abc.com
	Password ---> 181E@wFT
	*/
	  public String showCredentials(Employee employee) 
	{
		return ("Dear "+employee.getFirstname()+" your generated credentials are as follows \n"+
				"Email---> "+employee.getFirstname()+employee.getLastname()+"@"+employee.getDepartment()+"."+COMPANY_DOMAIN+"\n"+
				"Password --->"+employee.getPassword());
		
		
	}

}
