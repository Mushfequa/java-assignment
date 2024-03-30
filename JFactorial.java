package assignment;

public class JFactorial {
	public static void main(String[]args){
		System.out.println("factorial of 4:"+ factorial(4));
		System.out.println("factorial of 3:"+ factorial(3));
		System.out.println("factorial of 2:"+ factorial(2));
		System.out.println("factorial of 1:"+ factorial(1));
		System.out.println("factorial of 0:"+ factorial(0));
	}
	public	static int factorial(int n){
		if(n==0||n==1) {
		return 1;
		}else {
			int result=1;
			for(int i=2;i<=n;i++) {
				result*=i;
			}
			return result;
		
		}

		
		
		}
		}

