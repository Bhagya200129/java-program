import java.util.Scanner;
public class trnps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
int transpose[][] = new int [col][row];
for (i=0;i<col;i++)
{ for (j=0;j<row;j++)
	transpose[i][j] = mat[j][i];
}
System.out.println("transpose matrix ");
 for (i=0; i<col ; i++)
 {
	 for (j=0; j<row ;j++)
	 { 
		 System.out.print(transpose[i][j]+ " ");
	 }
	 System.out.println();
	 }
}
	}


