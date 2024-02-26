package assignment;

import java.util.Scanner;

public class Assignment64 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your age");
			int age  = s1.nextInt();
			
		if (age>18) {
			System.out.println("You can access www.google.com");
		}
		else {
			
			throw new ArithmeticException("AirthmeticException");		
			}
	}

}
