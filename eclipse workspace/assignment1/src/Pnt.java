import java.util.*;
public class Pnt {

		double x,y;
		void setpoint()
		{
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter the coordinates:  ");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		static void findDistance(Pnt p1, Pnt p2)
		{
			double d_x = Math.pow((p2.x-p1.x),2);
			double d_y = Math.pow((p2.y-p1.y),2);
			double dist = Math.sqrt(d_x+d_y);
			System.out.println(" Distance = "+dist);
		}

		public static void main(String[] args)
		{
			Pnt p1 = new Pnt();
			p1.setpoint();
			
			Pnt p2 = new Pnt();
			p2.setpoint();
			
			findDistance(p1,p2);
			
			
		}
	

	}


