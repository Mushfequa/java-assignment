/*
 * W.A.J.P TO demonstrate try catch block take two numbers from the user by command line argument and perform
 * the division operation and handle ArethmeticException .
 * 
 * 
 * 
 */

package assignment;


public class JavaArethmeticException {
	public static void main (String []args) {
	if(args.length<2) {
		System.out.println("Usage:DivisionOperation<num1><num2>");
				return;
	}
	
	try {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int result=num1/num2;
		
		
		System.out.println("Result of division:"+result);
		
		
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured:Division by zero is not allowed.");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException occured:Please provide valid integer as input.");
	
}
}
}
