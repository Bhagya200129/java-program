import java.util.*;

class Student
{
	String name ;
	int roll,mark;
	void setData()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println(" enter the name,roll,marks :");
		name = sc.next();
		roll = sc.nextInt();
		mark =sc.nextInt();
	}
	void display()
	{
		System.out.println("name : "+ name +"   roll= "+ roll +"  marks is : "+ mark) ;
	}
}
public class SD {

	public static void main(String[] args) {
		Student s[] = new Student[3];
		
		for(int i =0;i<s.length;i++)
		{
			s[i] = new Student();
			s[i].setData();
			
		}
		for (int i=0;i< s.length;i++)
			s[i].display();
	}
	}

