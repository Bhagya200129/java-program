import java.util.*;
class person
{
	String  name;
	int age ;
	person(String n,int a)
	{
		name=n;
		age=a;
	}
}
class student1 extends person
{
	String course;
	int roll,mark;
	student1(String name,int age,String course,int roll,int mark)
	{
		super(name,age);
		this.course = course;
		this.roll = roll;
		this.mark = mark;
	}
	void display()
	{
		System.out.println("student name ="+ name + " ,roll= "+roll+ ", course = "+ course+ ", mark ="+ mark+ " ,age ="+age);
	}
}
class teacher extends person
{
	String subject_assigned;
	int contact_hour;
	teacher(String name ,int age,String sub, int c)
	{
		super(name,age);
		subject_assigned = sub;
		contact_hour = c;
	}
		void display()
		{
			System.out.println("teacher name ="+ name + " ,subject assigned= "+subject_assigned+ ", contant hr = "+contact_hour+  " ,age ="+age);
		}
}	
public class q5 {

	public static void main (String[] args)
	{
		student1 s = new student1("abc",21,"btech",1,90);
		s.display();
		teacher t = new teacher ("xyz",31,"dsa",5);
		t.display();
		
	}
		
		
		}
		

	


