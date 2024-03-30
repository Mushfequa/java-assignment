package assignment;




/*
 * 
 * create class named Rectangle with two data members Length and breadth and two methods to print
 * the area and parameter of the Rectangle respectively.its constructor having parameters for 
 * length and breadth is used to initialize the length and breadth of the Rectangle.let class
 * square inherit the rectangle class with its constructor having a parameter for its side (suppose s)
 * calling the constructor  of its parent class as super(s,s)print the area and parameters of a Rectangle
 * and Square.
 * 
 * 
 */
class Rectangle{
	double length,breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
		void area() {
		System.out.println("area of rectangle:"+(length+breadth));
			
	}
	void perimeter() {
		System.out.println(2*(length+breadth));
	}
}
	class Square extends  Rectangle{
		
		public Square(int s){
			 super(s,s);
				 
			 }}
		 
public class Question25 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(4,5);
		
		r.area();
		
		r.perimeter();
		 Square s=new Square(4);
		 s.area();
		 s.perimeter();
		 
	

		 
	}	 
		 
	}
		 
	
		
	

