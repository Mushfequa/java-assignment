/*we have to calculate the area of a rectangle,square and a circle .create an abstract class shape with three
 * abstract methods namely RactengleArea taking two parameters,'SquareArea'and 'CircleArea'taking one parameter
 * each the parameters of RactengleArea are its length and breadth,that of 'SquareArea'is its side and that of
 * 'CircleArea' is its radius.now create another class Area containing all the three methods  RactengleArea,
 * 'SquareArea','CircleArea' for printing  the area of rectangle,square and circle respectively .create an 
 * object of class Area and call all three methods.
 * 
 */

//question32
package assignment;

abstract class Shape{
abstract double RectangleArea(double leangth,double breadth);
abstract double SquareArea(double side);
abstract double CircleArea(double radius);
 }
 


 class Area extends Shape{

double  RectangleArea(double length,double breadth){
	
	return length*breadth;
	
	}

	double CircleArea(double radius){
		return Math.PI*radius*radius;
		
	}


	double SquareArea(double side){
		return side*side;
	}

	
}
public class ObjArea {
	public static void main (String [] args){
	     Area a=new  Area();
	     	double length=5.0;
	     	double bredth=3.0;
	     	double side=4.0;
	     	double radius=2.5;
		double rectangleArea= a.RectangleArea(length,bredth);
		
		double circleArea =a.CircleArea(radius);
			
		double squareArea=	a.SquareArea(side);
		
		System.out.println("Area of Rectangle :"+rectangleArea);
		System.out.println("Area oF Circle :"+circleArea);
		System.out.println("Area of Square :"+squareArea);
		
		}

}
