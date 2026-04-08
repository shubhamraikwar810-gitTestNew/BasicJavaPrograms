package javaprogramseclipse;

public class DefaultConstructorsandParameterizedConstructorEmployee 

{
	
	int empid;
	String ename;
	float sal;
	
DefaultConstructorsandParameterizedConstructorEmployee() //Default Constructor
{
	empid = 0;
	ename = null ;
	sal = 0.0F;
}

DefaultConstructorsandParameterizedConstructorEmployee(int eid, String nm, float s)
{
	empid = eid;
	ename = nm;
	sal = s;
}
	void display()
	{
		System.out.println("Employee id = "+empid);
		System.out.println("Employee name = "+ename);
		System.out.println("Salary = "+sal);
	}

	public static void main(String args[]) 
	
	{
		
		DefaultConstructorsandParameterizedConstructorEmployee e1 = new DefaultConstructorsandParameterizedConstructorEmployee(1,"Keerti",50000);
		DefaultConstructorsandParameterizedConstructorEmployee e2 = new DefaultConstructorsandParameterizedConstructorEmployee(2,"Rakesh",120000);
		DefaultConstructorsandParameterizedConstructorEmployee e3 = new DefaultConstructorsandParameterizedConstructorEmployee();
		e1.display();
		e2.display();
		e3.display();
	}

}
