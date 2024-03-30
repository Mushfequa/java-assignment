//question30
package assignment;

import java.util.*;

abstract class Marks {
	public float getPercentages() {
		return 0;
	}

}

class A extends Marks {
	private float marks1, marks2, marks3;

	public A(float m1, float m2, float m3) {
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
	}

	public float getPercentage() {
		return (marks1 + marks2 + marks3) / 300 * 100;
	}

}

class B extends Marks {
	private float marks1, marks2, marks3, marks4;

	public B(float m1,float m2,float m3,float m4){
	marks1=m1;
	marks2=m2;
	marks3=m3;
	marks4=m4;
	}
public float getPercentage() {
	
return(marks1+marks2+marks3+marks4)/400*100;

}
}

public class JavaAbstraction {

	public static void main (String []args){
		A studentA= new A(80,82,90);
		B studentB = new B(90,92,80,70);
		System.out.println("percentage of marks studentA:"+studentA.getPercentage());
		System.out.println("percentage of marks studentB:"+studentB.getPercentage());


		}

	
	}

