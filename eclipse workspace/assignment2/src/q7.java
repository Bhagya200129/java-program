import java.util.Scanner;

interface A
{
	void display ();
	void count ();
	
}
class B implements A
{
	static int maxcount;
	String name;
	B()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		name = sc.next();
	}
	public void display ()
	{
		System.out.println("name : "+ name + " & total no of characters present = "+ maxcount );
		
	}
	public void count ()
	{
		maxcount = name.length();
	
	}
}
public class q7 {

	public static void main(String[] args)
	{
		B x = new B();
		x.count ();
		x.display();


	}

}
