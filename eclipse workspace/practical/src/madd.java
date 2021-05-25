import java.util.*;
public class madd {

	public static void main(String[] args) {
		//addition of two matrix
		Scanner sc = new Scanner (System.in);
		System.out.println("enter row1 and col1 of a matrix :");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int matA[] []= new int [row1][col1];
		System.out.println("enter matrix first matrix elements: ");
		int i,j;
		for (i=0;i<row1;i++)
		{
		  for (j=0;j<col1;j++)
			  matA[i][j] = sc.nextInt();
		}
		System.out.println("first matrix A is:  ");
		for (i=0;i<row1;i++)
		{  
			for (j=0;j<col1;j++)
			{
				System.out.print(matA[i][j]+" ");
			}
			System.out.println();
	}	

		
		System.out.println("enter row2 and col2 of a matrix :");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int matB[] []= new int [row2][col2];
		System.out.println("enter matrix second matrix elements: ");
		
		for (i=0;i<row2;i++)
		{
		  for (j=0;j<col2;j++)
		  
		  
			  matB[i][j] = sc.nextInt();
		}
		System.out.println("first matrix A is:  ");
		for (i=0;i<row2;i++)
		{  
			for (j=0;j<col2;j++)
			{
				System.out.print(matB[i][j]+" ");
			}
			System.out.println();
		}
		if ((row1 == row2)&&(col1 == col2))
		{
			int matC[][] = new int [row1][col2];
			for (i=0; i<row1;i++)
			{
				for (j=0;j<col2;j++)
					matC[i][j]= matA[i][j]+matB[i][j];
			
			}
			
			System.out.println("OUTPUT MATRIX....");
		       for (i=0;i<row1;i++)
		       {
		    	   for (j=0;j<col2;j++)
		    	   {
		    		   System.out.print( matC[i][j]+" ");
		    	   }
		    	   System.out.println();
		       }
		}
		else
			System.out.println("addition can't be done");
	}
}
		
		


