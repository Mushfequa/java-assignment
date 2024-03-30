package assignment;
class Member{
	
	
	String name;
	int age;
	long phoneNo;
	String address;
	double salary;
	public void printSalary() {
	System.out.println("salary:"+salary);
}
}
class Employee extends Member{
	String specialization;
	


}

class Manager extends Member{
	
	String department;
	


	
}

public class Question24 {
	public static void main(String[] args) {
	
		
		Employee e= new Employee();
		e.name="siya";
		e.age=25;
		e.phoneNo=1234563250L;
		e.address="surat";
		e.salary=30000;
		e.specialization="MBA";
		
	
		Manager m=new Manager();
		m.name="kiyan";
		m.age=27;
		m.phoneNo=1236947890L;
		m.address="surat";
		m.salary=50000;
	    m.department="Finance";
	
	}

}
