package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		
		
		try{
			Scanner s1 = new Scanner(System.in);
			int c = 1/0;
			int a = s1.nextInt();
			
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		
		catch(InputMismatchException a1) {
			System.out.println("InputMismatchException");
		}
	}

}
