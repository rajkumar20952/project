package com.flp.ems.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class UserInteraction {
	Scanner sc=new Scanner(System.in);

	Date date=new Date();
public void AddEmployee() {
		// TODO Auto-generated method stub
		System.out.println("\nName");
		String name=sc.next();
	
		System.out.println("\nKin Id \n Please enter number");
		int kinid=sc.nextInt();
	
		System.out.println("\nEmail id \n Please enter properly with [ your id@  .com] ");
		String emailid=sc.next();
		
		System.out.println("\nPhone no \n Please enter 10 digit phone number");
		long phoneno=sc.nextLong();
		
		System.out.println("\nAddress");
		String address=sc.next();
	
		System.out.println("\nDate of birth");
		SimpleDateFormat dob=new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(dob.format(date));
		
		System.out.println("\nDate of Joining");
		SimpleDateFormat doj=new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(doj.format(date));
		//int dateofjoining=sc.nextInt();
		
		System.out.println("\nDepartment");
		String department=sc.next();
	
		System.out.println("\nProject");
		String project=sc.next();
		
		System.out.println("\nRoles");
		String roles=sc.next();
		
		HashMap h=new HashMap();
		h.put("name", name);
		h.put("name", name);
		h.put("kinid", kinid);
		h.put("emailid", emailid);
		h.put("emailid", emailid);	
		h.put("address", address);	
		h.put("department", department);
		h.put("project", project);
		h.put("roles", roles);
		
	}

	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}
