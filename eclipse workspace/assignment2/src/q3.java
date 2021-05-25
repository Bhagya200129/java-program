import java .util.Scanner;
class Student 
{ 
	String name ,course;
	int roll;
	void input_student()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the details :( name ,roll, course)   ");
		name = sc.next();
		roll = sc.nextInt();
		course = sc.next();
		
	}
	void display_student()
	{
		System.out.println("name = "+ name + " roll = "+ "course= "+ course ) ;
		
	}
}
class Exam extends Student 
{
	int m1,m2,m3;
	void input_mark()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the details :( mark1, mark2, mark3)");
		m1 =sc.nextInt();
		m2 =sc.nextInt();
		m3 =sc.nextInt();
		}
	void display_result() 
	{
		System.out.println("result ="+ (m1+m2+m3));
	}
}
public class q3 {

	public static void main(String[] args) 
		{
			Exam e[]= new Exam[5];
			for(int i =0;i<e.length;i++)
			{
				e[i]= new Exam();
				e[i].input_student();
				e[i].input_mark();
				e[i].display_student();
				e[i].display_result();
			}
		}
	}
	
	

	


