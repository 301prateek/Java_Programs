package com.bridge.prateek.java_assignment;
import java.util.Random;

//Program for if else and if else if condition//

public class ConditionalStatements {
	
	//Employee attendance and wage
	int fulltime = 1;
	int parttime = 2;
	int absent   = 0;
	int payPerHr = 20;
	
	//function to calculate salary, if-else-if condition to check
	void employee(int b)
	{
		System.out.println("Checking employee attendence and printing salary");
		if(b == fulltime) {
			
			int time = 8; 
			int salary = payPerHr * time ;
			System.out.println("Employee is present, salary : "+salary);
		}
		else if(b == parttime) {
			
			int time = 4;
			int salary = payPerHr * time ;
			System.out.println("Employee worked part time, salary : "+salary);
		}
		else {
			int time = 0;
			int salary = payPerHr * time ;
			System.out.println("Employee is absent, salary : "+salary);
		}
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(2);
		System.out.println("Random number : "+a);
		int empPresent = 1;
		int empAbsent  = 0;
		
		
		// if else condition to check employee attendance //
		if(a == empPresent) {
			System.out.println("Employee is present");
			System.out.println("-------------------");
		}
		else {
			System.out.println("Employee is absent");
			System.out.println("-------------------");
		}
		
		
		//Creating an object and calling the function 
		
		int b = r.nextInt(3);
		System.out.println("Random number: "+b);
		ConditionalStatements c = new ConditionalStatements();
		c.employee(b);
		
	}
}
