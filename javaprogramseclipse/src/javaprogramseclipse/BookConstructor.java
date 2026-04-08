package javaprogramseclipse;

public class BookConstructor 
{

	int bookid;
	String bookname;
	String author;
	float price;
	
	
	BookConstructor()
	{
		bookid = 0;
		bookname = null;
		author = null;
		price = 0.0f;
		
		
	}
	
	BookConstructor(int id,String bname,String bauthor,float bprice)
	{
	 bookid = id;
	 bookname = bname;
	 author = bauthor;
	 price = bprice;
	}
	
	void display()
	{
		System.out.println("Book Id is "+bookid);
		System.out.println("Book name is "+bookname);
		System.out.println("Book author is "+author);
		System.out.println("Book price is "+price);
	}
	
	public static void main(String[] args) 
	
	{
		BookConstructor b1 = new BookConstructor(1,"Maths","Dasgupta",210.20F);
		BookConstructor b2 = new BookConstructor(109,"Physics","HC Verma",190.11F);
		BookConstructor b3 = new BookConstructor();
		b1.display();
		b2.display();
		b3.display();
		}

}
