package com.greatlearning.service;

import com.greatlearning.model.employeeLab1;

public interface EmployeeService {
	String generateEmailID(String fname,String lname,String deptname);
	String generatePassword();
	void showEmployeeDetails(employeeLab1 e);

}
