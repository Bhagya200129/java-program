import java.util.Scanner;
class pointtype1
{ 
	double x,y;
	void set()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter co-ordinates: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
	}
}
class circletype2 extends pointtype1
{
	double radius,area,circum;
	void area_circum(circletype2 c1, circletype2 c2)
	{
		radius = Math.sqrt(Math.pow((c2.x-c1.x),2)+ Math.pow((c2.y-c1.y),2));
		area = Math.PI*radius*radius;
		circum = 2*Math.PI*radius;
		System.out.println("radius = "+ radius + ",area = "+area+ ",circumference= "+circum );
	}
}
public class q4 {

	public static void main(String[] args) 
	{
		circletype2 c1 = new circletype2();
		c1.set();
		circletype2 c2 = new circletype2();
		c2.set();
		circletype2 c3 = new circletype2();
		c3.area_circum(c1, c2);
		

	}

}
