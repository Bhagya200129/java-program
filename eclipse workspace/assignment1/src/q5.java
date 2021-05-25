import.java.util.*;
public class q5 {

	public static void main(String[] args) 
	{
		
		Scanner in =new Scanner(System.in);

		System.out.println(“enter value of n”);
		int n =in.nextInt();
		boolean b =isOdd(n);
		if(b==true)
		System.out.println(“odd”);
		}
		Public statc boolean isOdd(int n)
		{
		While(n>1)
		{
		n =n-2;
		}
		If(n==1)
		return true;
		else
		return false;
		
	}

}
