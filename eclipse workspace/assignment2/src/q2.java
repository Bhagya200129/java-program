import java.util.*;
class complex
{
	double real,imag;
	void setdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter real nd imaginary values  ");
		real = sc.nextDouble();
		imag = sc.nextDouble();
		
	}
	void display()
	{
		System.out.println(real+"+i"+imag);
		
	}
	public complex add(complex c1, complex c2)
	{
		complex c3 =new complex ();
		c3.real = c1.real + c2.real;
		c3.imag = c1.imag + c3.imag;
		return c3;
	}
}
public class q2 {

	public static void main(String[] args)
	{ 
		complex c1 = new complex();
		c1.setdata();
		complex c2 = new complex();
		c2.setdata();
		
		System.out.println("complex no1 = ");
		c1.display();
		System.out.println("complex no 2 = ");
		c2.display();
		
		complex c3 = new complex();
		c3=c3.add(c1, c2);
		System.out.println("addition ");
		c3.display();
	}
		

	}


