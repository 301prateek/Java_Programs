package com.bridge.prateek.java_assignment;
import java.util.Arrays;
import java.util.Scanner;

public class Loops {
	
	//while loop to print the number until n is greater than zero//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("________________________");
		
		while(n > 0) 
		{
			System.out.println(n);
			n--;
		}	
	
	
		//do while loop to print Java m number of times
		
		System.out.println("________________________");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number to print: ");
		int m = sc1.nextInt();
		System.out.println("________________________");
		int o = 1;
		
		do {
			System.out.println(o+" Java.");
			o++;
		}while( o <= m );
		
		
		//for loop to print sum of n numbers
		
		System.out.println("________________________");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number to get sum: ");
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is: "+sum);
			
		//nested for loop 
		System.out.println("________________________");
		int c = 1;
		int d = 3;
		
		for(int i=1; i<d; i++) {
			for (int j = 1; j <= d; j++) {
				int sum1 = i+j;
				System.out.println( i+" + "+j+" = "+ sum1);
				
			}
		}
		
		//array
		System.out.println("________________________");
		System.out.println("Enter the lenth of array: ");
		Scanner s = new Scanner(System.in);
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter "+num+" values: ");
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i]=sc.nextInt() ;
		}
		System.out.println(Arrays.toString(ar));
		
	}
}
