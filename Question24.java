package assignment;
class Member{
	
	
	String name;
	int age;
	String phoneNo;
	String address;
	double salary;
	public void printSalary() {
	System.out.println("salary:"+salary);
}
}
class Employee extends Member{
	String specialization;
	
//constructor
	public Employee(String name,int age,String phoneNo,String address,double salary,String specialization){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
		this.specialization=specialization;
	}

}

class Manager extends Member{
	
	String department;
	
//constructor
	public Manager(String name,int age,String phoneNo,String address,double salary,String department){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
		this.department=department;
	}

	
}

public class Question24 {
	public static void main(String[] args) {
	
		
		
		Employee e= new Employee("siya",25,9856231256,"surat"30000,"MBA");
		
	
		Manager m=new Manager(="kiyan",27,12369478900,"surat",50000);
		
	    m.department="Finance";
	System.out.println("Employee Details:");
	System.out.println("Name:"+employee.name);
	System.out.println("Age:"+employee.age);
	System.out.println("Phone Number:"+employee.phoneNumber);
	System.out.println("Address:"+employee.address);
	System.out.println("Specialization:"+employee.specialization);
		System.out.println("\nManager Details:");
	System.out.println("Name:"+Manager.name);
	System.out.println("Age:"+Manager.age);
	System.out.println("Phone Number:"+Manager.phoneNumber);
	System.out.println("Address:"+Manager.address);
	System.out.println("Department:"+Manager.Department);
	}

}
