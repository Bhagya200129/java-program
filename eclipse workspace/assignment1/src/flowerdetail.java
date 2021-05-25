import java.util.Scanner;
class flower1
{
	String name;
	int no;
	float price;
	void input()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter name, no of petals and price: ");
		name =sc.next();
		no = sc.nextInt();
		price = sc.nextFloat();
		
	}
	void display()
	{System.out.println("name = "+ name+ " no of petals  : "+ no+ " price = "+ price);
	
	}
}
public class flowerdetail {

	public static void main(String[] args) 
	{
		flower1 f[] = new flower1[5];
		for(int i =0 ; i<f.length; i++)
		{
			f[i]=new flower1();
			f[i].input();
			
		}
		for(int i= 0;i<f.length;i++)
			f[i].display();

	}

}
