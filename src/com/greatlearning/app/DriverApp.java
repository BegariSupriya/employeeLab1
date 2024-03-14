package com.greatlearning.app;

 import java.util.Scanner;

import com.greatlearning.model.employeeLab1;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
       System.out.println("Please enter your first Name");
       String firstName=sc.next();
       System.out.println("Please enter your lastName");
       String lastName=sc.next();
       
       
       System.out.println("1.technical");
       System.out.println("2.Admin");
       System.out.println("3.HR");
       System.out.println("4.Legal");
       
       System.out.println("Please choose the Dept");
       int choice=sc.nextInt();
       String genEmail="";
       
       String genPassword="";
       switch(choice)
       {
       
       case 1:genEmail=empImpl.generateEmailID(firstName,lastName,"tech"); break;
       case 2:genEmail=empImpl.generateEmailID(firstName,lastName,"admin"); break;
       case 3:genEmail=empImpl.generateEmailID(firstName,lastName,"hr"); break;
       case 4:genEmail=empImpl.generateEmailID(firstName,lastName,"leagal"); break;
       default:System.out.println("Please enter valid input");  
       }
       
      
       
       
       genPassword=empImpl.generatePassword();
       
       employeeLab1 e1=new employeeLab1();
       
       e1.setFirstName(firstName);
       e1.setLastName(lastName);
       e1.setEmail(genEmail);
       e1.setPassword(genPassword);
       
       empImpl.showEmployeeDetails(e1);
       
       
       }
	
	

}
