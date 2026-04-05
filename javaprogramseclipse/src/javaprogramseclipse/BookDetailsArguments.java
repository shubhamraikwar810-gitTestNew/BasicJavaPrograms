package javaprogramseclipse;
import java.util.*;


public class BookDetailsArguments

{

	int bid;
	String bname;
	float bprice;
	
	void input(int b, String n, float p)  //Arguments declaration in input function - Formal Arguments
	{
		bid =b;
		bname = n;
		bprice = p;
		
	}
	
	void display()
	{
		System.out.println("Book id =" +bid);
		System.out.println("Book name =" +bname);
		System.out.println("Book Price =" +bprice);
	}
	
	public static void main(String args[])
	
	{
		BookDetailsArguments b1 = new BookDetailsArguments();
		BookDetailsArguments b2 = new BookDetailsArguments();
		b1.input(21,"Science Book",100);
		b2.input(22,"Maths",200);
		b1.display();
		b2.display();

	}

}
