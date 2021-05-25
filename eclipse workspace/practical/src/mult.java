import java.util.*;
public class mult {

	public static void main(String[] args) {
		// multiplication of two matrices
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
		System.out.println("second matrix B is:  ");
		for (i=0;i<row2;i++)
		{  
			for (j=0;j<col2;j++)
			{
				System.out.print(matB[i][j]+" ");
			}
			System.out.println();
		}
		//multiplication of two matrices
		if (col1==row2)
		{  
			System.out.println("the output matrix ::::");
			int matC[][]=new int [row1][col2];
			for (i=0;i<row1;i++)
			{
				for (j=0;j<col2;j++)
				{
					matC[i][j]=0;
					for(int k=0;k<row2;k++)
					
						matC[i][j]+=matA[i][k]*matB[k][j];
					
				}
				System.out.print(matC[i][j]+" ");
			
			System.out.println();	
			}
		}	
	
	else
	
		System.out.println("multiplication can't be done..sry");
	
    }
}
