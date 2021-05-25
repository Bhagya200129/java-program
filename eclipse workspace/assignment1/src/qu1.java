import java.util.*;
public class qu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter 3 nos");
int a =sc.nextInt();
int b = sc.nextInt();
int c= sc.nextInt();
if(a+b==c)
	System.out.println("condition 1 is true");
else if (a==b-c)
	System.out.println("condition 2 is true");
else if(a*b==c)
	System.out.println("condition 3 is true ");
else
	System.out.println("false");

	}

}
