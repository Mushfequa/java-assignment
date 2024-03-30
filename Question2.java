package assignment;

public class Question2 {
	public static void main(String [] args){
		int start=3;int end=15;
		for(int i=start;i<=end;i++){
		if(i<1){
		return;
		}
		int flag=0;
		for(int j=1;j<=i;j++){
		if(i%j==0){
		flag++;
		}
		}
		{
		System.out.println(i+"is prime number.");
		}
		}
		}
		}


