package basic;

import java.util.Scanner;

class Person
{
	String Gender; 
	String Nationality;
	String MarritalStatus;
	
	void get1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gender: ");
		Gender = sc.next();
		System.out.println("Enter your Nationality: ");
		Nationality = sc.next();
		System.out.println("Enter your MarritalStatus: ");
		MarritalStatus = sc.next();
	}
}

class Employee extends Person
{
	String Name, Address;
	int Id , MobileNo;
	float Salary;
	
	void get2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		Id = sc.nextInt();
		System.out.println("Enter Your Name: ");
		Name = sc.next();
		System.out.println("Enter Your Address: ");
		Address = sc.next();
		System.out.println("Enter Your MobileNo: ");
		MobileNo = sc.nextInt();
		System.out.println("Enter Your Salary: ");
		Salary = sc.nextFloat();
	}
	
	void put()
	{
		System.out.println("Employee's Details are: "+"\n"+
	            "Employee Id: "+Id+"\n"+ "Name: "+Name+"\n"+ "Address: "+Address+"\n"+
				"Mobile No: "+MobileNo+"\n"+"Gender: "+Gender+"\n"+"Nationality: "+Nationality+
				"\n"+ "Marrital Status: "+MarritalStatus+"\n"+ "Salary: "+Salary);
	}
}

public class SingleInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.get1();
		e1.get2();
		e1.put();		
	

	}

}
