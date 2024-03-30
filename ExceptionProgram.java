/*question 35
 * 
 * Take two number from the user and perform the division operation and handle arithmetic exception o/p
 * Enter two numbers 10 0
 */ 
 
 package assignment;
 

import java.util.Scanner;
public class ExceptionProgram {

	
	public static void main (String []args) {
		int number1;
		int number2;
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		Integer num1=sc. nextInt();
		System.out.println("Enter number1");
		Integer num2=sc. nextInt();
		
			System.out.println();
		}catch(ArithmeticException e) {
			System.out.println("Error:Division by zero is not allowed");
		}catch(Exception e) {
			System.out.println("Error:please enter valid number");
	}
}
}