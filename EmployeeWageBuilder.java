package com.employeewage;

import java.util.Scanner;

public class EmployeeWageBuilder {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation");
		int wageperhr=20;
		int dailyhrs=8;
		int parttime=4;
		int parttimewage=wageperhr*parttime;
		int dailywage;
		dailywage=wageperhr*dailyhrs;
		int monthlywage;
		monthlywage=dailywage*20;
		System.out.println("Daily wage of the employee = "+dailywage);
		System.out.println("Monthly wage of an employee = "+monthlywage);
		System.out.println("Choose an appropriate option: 1.Part-Time Employee ; 2.Full-Time Employee");
		int emptype=sc.nextInt();
		switch(emptype) {
		case 1:
			System.out.println("Daily wage of part-time employee is "+parttimewage);
			break;
		case 2:
			
			System.out.println("Daily wage of full-time employee is "+dailywage);
			break;
		}
		System.out.println("Enter the number of working days in a month");
		int workingdays=sc.nextInt();
		System.out.println("Enter the nunmber of working hours in a month");
		int workinghrs=sc.nextInt();
		int monthlywages=0;
		if(workingdays<=20 && workinghrs<=100) {
			dailywage=workinghrs*20;
			monthlywages=workingdays*dailywage;
		}
		System.out.println("Monthly wage for "+workingdays+"working days and"+workinghrs+"hrs per day="+monthlywages);
		
		double attendance=Math.floor(Math.random()*2);
		if(attendance==1.0) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}
