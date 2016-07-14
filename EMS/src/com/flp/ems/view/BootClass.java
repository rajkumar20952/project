package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	public static void main(String[] args) {
		System.out.println("Employee Management System");
		System.out.println("\n 1.AddEmployee\n 2.ModifyEmployee\n 3.RemoveEmployee\n 4.SearchEmployee\n 5.getAllEmployee\n");
		System.out.println("Please Enter your choice");
		Scanner sc=new Scanner(System.in);
		int i= sc.nextInt();
		menuSelection(i);
	}
 static void menuSelection(int a){
	UserInteraction u=new UserInteraction();
			switch(a)
			{
			case 1: u.AddEmployee();
			case 2:u.ModifyEmployee();
			case 3:u.RemoveEmployee();
			case 4:u.SearchEmployee();
			case 5:u.getAllEmployee();
			}

		 }
}
