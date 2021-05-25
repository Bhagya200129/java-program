import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter values :");
int a =sc.nextInt();
int b=0;
while (a>2)
{
	a=a/2;
	b++;
}
System.out.println("no of times"+ b);
	}

}
