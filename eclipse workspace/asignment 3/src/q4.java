class Box<T>
{
	T a;
	Box(T a)
	{
		this.a = a;
	}
	void update(T p)
	{
		a = p;
	}
	T display()
	{
		return a;
	}
}
public class q4 {

	public static void main(String[] args) 
	{
		
	Box<Integer> i = new Box<Integer>(34);
	System.out.println("original value :"+ i.display());
	i.update(67587);
	System.out.println("final updated value:  "+i.display()+"\n\n");
	
	Box<String> s = new Box<String>("hello");
	System.out.println("original value :"+ s.display());
	s.update("helloworld");	
	System.out.println("final value updated:  "+ i.display()+"\n\n");

	System.out.println("Object Root class");
	Box<Object> o = new Box<Object>(786);  //object root can take any type of value
	System.out.println("original value:"+o.display());
	o.update("abcdstring");
	System.out.println("final value updated in object root class is:"+o.display() );

	

	}

}
