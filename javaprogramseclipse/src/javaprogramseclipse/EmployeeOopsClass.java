
package javaprogramseclipse;

import java.util.Scanner;     //for running Scanner class

public class EmployeeOopsClass {
	
	int empid;         //Data members
	String ename;      //Data members
	float sal;         //Data members
	
	void input()     //Member Function  (for class)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee id, Name and Salary");
		empid = s.nextInt();
		ename = s.next();
		sal = s.nextFloat();
	}
	
	void display()  // Member Function (for class)
	{
		System.out.println("Employee ID =" +empid);
		System.out.println("Emplyee Name =" +ename);
		System.out.println("Salary =" + sal);
	}

	public static void main(String[] args) 
	{
		EmployeeOopsClass e1 = new EmployeeOopsClass(); //(class declaration + object declaration + instantiating the object)
		EmployeeOopsClass e2 = new EmployeeOopsClass();  //(Class declaration + object declaration + instantiating the object)
		e1.input();
		e2.input();
		e1.display();
		e2.display();
	

	}

}
