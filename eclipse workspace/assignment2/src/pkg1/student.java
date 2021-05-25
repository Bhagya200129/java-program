package pkg1;

import java.util.Scanner;

public class student {

	String name;
	int roll;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter name and no : ");
		name = sc.next();
		roll = sc.nextInt();
	}
	public void output()
	{
		System.out.println("Name :"+ name + " , Roll = "+ roll);

	}
}
