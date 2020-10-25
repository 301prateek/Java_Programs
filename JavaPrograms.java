package com.bridge.prateek.java_assignment;
import java.util.Scanner;
//This is a simple if condition program//

public class JavaPrograms {
	
	//Checking if answer is correct
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = 100;
	int b = 10;
	int c = a+b;
	System.out.println("What is the sum of "+a+" and "+b+" : ");
	int d = sc.nextInt();
	
	if( d == c) {
		System.out.println("Right answer: "+d);
	}
	else {
		System.out.println("Wrong answer it is : "+c);
	}
	

	//Comparing two strings
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name: ");
	
	String string1 = "Prateek";
	
	String string2 = s.nextLine();
	
	//strictly checking with case sensitive 
	if( string2.equals(string1) ) {
		
		System.out.println("You have entered your name correctly: "+string1);
	}
	else {
		
			System.out.println("You entered wrong it is => "+string1);
		
	}
  }
}
