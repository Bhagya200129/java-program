import java.util.*;
public class q2 {

	public static void main(String[] args)
	{ 
		String s[]=new String [3];
		Scanner sc = new Scanner (System.in);
		System.out.println("enter array elements: ");
		for (int i=0;i<s.length;i++)
			s[i]=sc.next();
		try 
		{
			s[3]= "brown";
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("exception handled: "+ a);
			
		}
		try
		{
			s[2]=null;
			System.out.println(s[2].length());
		}
		catch (NullPointerException n)
		{
			System.out.println("exception handled :"+n);
		}
		
	

	}

}
