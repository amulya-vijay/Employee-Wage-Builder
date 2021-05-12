package com.employeewage;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int wageperhr=20;
		int dailyhrs=8;
		int dailywage;
		int monthlywage;
		dailywage=wageperhr*dailyhrs;
		monthlywage=dailywage*20;
		System.out.println("Daily wage of the employee = "+dailywage);
		System.out.println("Monthly wage of an employee = "+monthlywage);
		double attendance=Math.floor(Math.random()*2);
		if(attendance==1.0) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}
