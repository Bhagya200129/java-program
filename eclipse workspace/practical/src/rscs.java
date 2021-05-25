import java.util.*;
public class rscs {

	public static void main(String[] args) {
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
//finding the rowsum and columnsum
		int rsum =0,csum =0;
		for (i=0 ;i<row;i++)
		{	
			rsum =0;
			for ( j=0; j< col; j++)
			{ 
				rsum = rsum + mat[i][j];
				
			}
			System.out.println("sum of "+ (i+1)+ "row ="+rsum);
			
		}
		for (i=0;i<col;i++)
		{
			csum = 0;
			for (j= 0;j<row ;j++)
			{
				csum = csum + mat[i][j];
				
			}
			System.out.println("sum of "+ (i+1 )+"column ="+csum);
		}
	}
}
	


