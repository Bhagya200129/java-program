import java.util.*;
class commission
{
	double sale ,com;
	commission(double s)
	{
		sale = s;
	}
	double getCommission()
	{
		if (sale < 500)
			com = 0.02*sale;
		else if (sale >= 500 && sale<5000)
			com =0.05*sale;
		else 
			com =0.08*sale;
		return com;		
	}
}
  
public class demo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sales amount : ");
		double sale = sc.nextDouble();
		
		 if (sale<0)
			 System.out.println("invalid input !!");
		 else 
		 {
			 commission c = new commission(sale);
			 System.out.println("for sale amount ="+ sale + " ,commission= "+c.getCommission());
		 }
		

	}

}
