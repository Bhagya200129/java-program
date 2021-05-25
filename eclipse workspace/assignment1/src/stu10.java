import java.util.Scanner;
class student
{
			String name ;
			int roll,mark;
			void setData(String n,int r,int m)
			{
				name = n;
				roll = r;
				mark = m;
				
			}
			void display()
			{
				System.out.println("name : "+ name +"   roll= "+ roll +"  marks is : "+ mark) ;
			}
		}
		public class stu10 {

			public static void main(String[] args) {
				student s[] = new student[3];
				String name;
				int roll,mark;
				Scanner sc =new Scanner (System.in);
				
				for(int i =0;i<s.length;i++)
				{
					s[i] = new student();
					System.out.println(" enter the name,roll,marks :");
					name = sc.next();
					roll = sc.nextInt();
					mark =sc.nextInt();
					s[i].setData(name ,roll, mark);
					
				}
				for (int i=0;i< s.length;i++)
					s[i].display();
			}
			


	}


