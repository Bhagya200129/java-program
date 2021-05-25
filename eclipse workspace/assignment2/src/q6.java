abstract class Shape
{
	abstract void area();
	
}
class Square extends Shape
{
	int side ;
	Square (int a)
	{
		side = a;
	}
	void area ()
	{
		System.out.println("square area : "+(side * side));
	}
}
class Triangle extends Shape 
{
	int a,b,c;
	Triangle (int a,  int b,  int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void area()
	{
		double s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Triangle area : "+ area);
	}
}
class Circle extends Shape
{
	int rad;
	Circle (int rad)
	{
		this.rad = rad;
	}
	void area()
	{
		double area2 = 3.14*rad*rad;
		System.out.println("Circle area :"+area2);
	}
}
public class q6 {

	public static void main(String[] args) {
		Shape x = new Square(4);
		x.area();
		Triangle y = new Triangle(3,4,2);
		y.area();
		Circle c = new Circle(4);
		c.area();
	}

}
