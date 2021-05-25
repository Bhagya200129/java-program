
public class q5
{
	public static <E> void printArray( E[] inputArray)
	{
		for(int i=0; i<inputArray.length;i++)
			System.out.println(inputArray[i]+"  ");		
	}

	public static void main(String[] args)
	{
		System.out.println("integer array is : ");
		Integer int_a[] = { 2,3,4,5,6,7,9};
		printArray(int_a);
		
		System.out.println("\n double array is: ");
		Double double_a[]= {4.6,6.8,8.3,7.2,5.1};
		printArray(double_a);
		
		System.out.println("\n string array is: ");
		String str_a[]= {"red","green","yellow"};
		printArray(str_a);

		System.out.println("\n boolean array is: ");
		Boolean bool_a[]= {true,false};
		printArray(bool_a);


	}

}
