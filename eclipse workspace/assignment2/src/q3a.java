import java.util.Scanner;

class viy
{
	String name;
	int mark;
}
class MarkOutOfBoundException extends Exception
{
	MarkOutOfBoundException(String s)
	{
		super(s);
	}
}

public class q3a {

	public static void main(String[] args) 
	{
		viy std = new viy();
		Scanner sc = new Scanner (System.in);
		System.out.println("enter name and mark :");
		std.name =sc.next();
		std.mark =sc.nextInt();
		try
		{
			if(std.mark > 100)
				throw new MarkOutOfBoundException("invalid mark inputted");
		}
		catch(MarkOutOfBoundException m)
		{
			System.out.println("exception handled :"+ m);
		}
	

	}

}
