package exception;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Dividend");
		int dividend=ip.nextInt();
		
		System.out.println("Enter Divisor");
		int divisor=ip.nextInt();
		
		try {
			int quotient = dividend/divisor;
			System.out.println("Quotient=" +quotient);
		}catch(ArithmeticException e) {
			System.out.println("You are trying to divide a number by zero");
		}
		
	}

}
