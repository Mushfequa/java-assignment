package assignment;
/*
 * question-6
 * 
 * W.A.P.J to make such a pattern like right angle triangle with number increased by 1 the pattern like.
 */
public class RightAngleTrianglePattern {
	public static void main(String[] args) {
		
		// you can change the number of rows as per your requirement
		int rows=5;
		// outer loop for number of rows
		for(int i=1;i<=rows;i++) {
			// inner loop for printing numbers
			
		for(int j=1;j<=i;j++) {
			System.out.println(j+"");
		}
		//move to the next line after printing each row
		System.out.println();
	}

}
}