import java.util.Scanner;
public class diagnl {

	public static void main(String[] args) {
		// to find diagnol sum 
		
	Scanner sc = new Scanner (System.in);
	System.out.println("enter row and col of a matrix ");
	int row = sc.nextInt();
	int col = sc.nextInt();
	int mat [] []= new int [row][col];
	System.out.println("enter matrix elements");
	int i,j;
	for (i=0;i<row;i++)
	{
	  for (j=0;j<col;j++)
		  mat[i][j] = sc.nextInt();
	}
	System.out.println("original matrix ");
	for (i=0;i<row;i++)
	{  
		for (j=0;j<col;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
		
	}
	int p= 0,s=0;
	for (i=0;i<row;i++)
	{
		for (j=0;j<col;j++)
		{ if (i==j)
		     p=p+mat[i][j];//primary diagnol
		     if ((i+j)== (row-1))
		    	 s = s + mat[i][j];// for secondary diagnol
		}
		 System.out.println("sum of primary diagnol is= "+p+"and secondary diagnol = "+s );
		     
	}
	
	}
}
	
	
			
		
	

	


