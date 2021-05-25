import java.util.*;
public class q1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no : ");
		int x= sc.nextInt();
		
		try
		{
			
			if (x<0)
				throw new NumberFormatException(" negative no inputted ");
			
		}	
		
		catch(NumberFormatException n)
		{
			System.out.println("exception handled : "+ n);

	}
	System.out.println("x ="+x);
	}
}
