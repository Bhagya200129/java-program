import java.util.*;
public class crds {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter the no of rows and columns you want ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat[][]= new int [row][col];
		System.out.println("enter matrix elements ");
		int i,j;
		for (i=0;i<row; i++)
		{
			for(j=0;j< col;j++)
				mat[i][j]= sc.nextInt();
			
		}
       System.out.println("display matrix element");
       for (i=0;i<row;i++)
       {
    	   for (j=0; j<col ;j++)
    	   {
    		   System.out.print(mat[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
