import java.util.Scanner;

interface EmpInterface
{
	void dispEmp();
	void giveBonus(double amount);
}
abstract class Employee
{
	String fname,lname;
	int empID,salary;
}
class Manager extends Employee implements EmpInterface
{
	double bonus;
	Manager()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the details (fname,lname,empID,salary):");
		fname =sc.next();
		lname = sc.next();
		empID= sc.nextInt();
		salary = sc.nextInt();
	}
	public  void  giveBonus(double amount )
	{
		try
		{
			if(amount <=0)
				throw new Exception("invalid input");
			else
			{
				bonus = amount;
				salary +=bonus;
			}
		}
		catch(Exception e)
		{
			System.out.println("exception handled of type:"+e);
		}
	}
	public void dispEmp()
	{
		System.out.println("name =  "+ fname +"   " +lname +" EmpID= " +empID+" salary is  "+salary);

		}
}
public class q8 {

	public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
		EmpInterface e[] = new EmpInterface[2];    //array of interface reference variable created 
		for (int i= 0; i< e.length; i++)
		{
			e[i] = new Manager();     //allocate memory with Manager()
			System.out.println("enter bonus amount : ");
			e[i].giveBonus(sc.nextDouble());
			e[i].dispEmp();
		}
	}
}
