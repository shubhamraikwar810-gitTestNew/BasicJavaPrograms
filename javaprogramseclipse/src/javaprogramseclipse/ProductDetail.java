package javaprogramseclipse;

public class ProductDetail 

{

	int pid;
	String pname;
	float price;
	String pexpiry;
	
	void input(int a, String b, float c, String d)
	{
		pid=a;
		pname=b;
		price=c;
		pexpiry=d;
	}
	
	void display()
	{
		System.out.println("Product id is " +pid);
		System.out.println("Product name is " +pname);
		System.out.println("Product price is " +price);
		System.out.println("Product Expiry is " +pexpiry);
	}
	
	public static void main(String args[]) 
	{
		ProductDetail p1 = new ProductDetail();
		ProductDetail p2 = new ProductDetail();
		p1.input(01,"Shampoo",20,"May 2026");
		p2.input(02,"Oil",200,"June 2027");
		p1.display();
		p2.display();
		

	}

}
