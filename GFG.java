package assignment;

/*
 * 
 * 
 */


//Question27
import java.util.*;
 abstract class complex{
 int real,imaginary;

 complex(){


}
complex(int tempReal,int tempImaginary){
real=tempReal;
imaginary=tempImaginary;
}
//Defining addComp() method
public class Complex {

	public int real;
	public int imaginary;
}
  Complex addComp(Complex C1,Complex C2)
{
Complex temp= new Complex();
temp.real =C1.real+C2.real;
temp.imaginary=C1.imaginary+C2.imaginary;
return temp;
}
//Definig substractComp() method
Complex substractComp(Complex C1,Complex C2)
{
Complex temp= new Complex();
temp.real =C1.real-C2.real;
temp.imaginary=C1.imaginary-C2.imaginary;
return temp;
}
//function for printing complex number.
void printComplexNumber()
{
System.out.println("complex number:"+real+"+"+imaginary+"i");
}
}
public class GFG{

public static void main(String [] args){
Complex C1= new Complex();
C1. printComplexNumber();
Complex C2= new Complex(9,5);
C2. printComplexNumber();

Complex C3= new Complex();
C3=C3.addComp(C1,C2);
//printing the sum
System.out.println(" sum of");
C3.printcomplexNumber();
C3=C3.substractComp (C1,C2);
System.out.println("Difference of");
C3.printcomplexNumber();
}
}


