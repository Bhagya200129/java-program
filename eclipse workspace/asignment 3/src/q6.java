
public class q6 
{
  public static <T> int count (T[] array,T item)
  {
	  int c=0;
	  for(int i=0;i< array.length;i++)
		  if (array[i].equals(item))
			  c++;
	  return c;
		

	}

	public static void main(String[] args) 
 
  {
		System.out.println("integer array is : ");
		Integer int_a[] = { 2,3,4,5,6,7,9};
		System.out.println("count = "+ count(int_a,5));
		
		System.out.println("\n double array is: ");
		Double double_a[]= {4.6,6.8,8.3,8.3,5.1};
		System.out.println("count = "+count(double_a,5.7));
		
		System.out.println("\n string array is: ");
		String str_a[]= {"red","green","yellow"};
		System.out.println("count = "+ count(str_a,"red"));

		
  }

}
