package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.employeeLab1;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fname, String lname, String deptName) {
		
		return fname+lname+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;
		
		String myPass="";
		Random random=new Random();
		for(int i=1;i<=8;i++)
		{
			myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
			
		}
		return myPass;
		
	}

	@Override
	public void showEmployeeDetails(employeeLab1 e) {
		System.out.println("employeeLab1 firstName is:"+e.getFirstName());
		System.out.println("employeeLab1 lastName is:"+e.getLastName());
		System.out.println("employeeLab1 Email is:"+e.getEmail());
		System.out.println("employeeLab1 password is:"+e.getPassword());
		
	}

}
