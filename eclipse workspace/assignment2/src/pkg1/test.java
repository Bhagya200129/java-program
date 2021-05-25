package pkg1;

import java.util.Scanner;

public class test extends student 
{
	int m1,m2;
	 public void input ()
	{
		 super.input();
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the mark1 and mark2 : ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
	}
    public void output ()
	{
    	super.output();
		System.out.println("  mark1 = "+ m1+ "  mark2 = "+ m2);
    }
}
