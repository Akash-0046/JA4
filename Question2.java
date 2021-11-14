package exception;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) throws UnsupportedOperationExcepion {
		Scanner ip=new Scanner(System.in);

		System.out.println("Enter Dividend");
		int dividend=ip.nextInt();

		System.out.println("Enter Divisor");
		int divisor=ip.nextInt();
		
		if(divisor==0)
			throw new UnsupportedOperationExcepion();
		
		int quotient = dividend/divisor;
		System.out.println("Quotient=" +quotient);
	}

}
