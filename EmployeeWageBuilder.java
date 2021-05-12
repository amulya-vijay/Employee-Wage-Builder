package com.employeewage;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int wageperhr=20;
		int dailyhrs=8;
		int dailywage;
		dailywage=wageperhr*dailyhrs;
		System.out.println("Daily wage of the employee = "+dailywage);
		double attendance=Math.floor(Math.random()*2);
		if(attendance==1.0) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
}
