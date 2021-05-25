import java.util.*;
public class q3 {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner (System.in);
		int count=0;
		char alpha[] ={'c','a','r','b','o','n'};
		int i,n,j,k,l,m;
		for(i=0;i<alpha.length;i++)
		{
			
	
		for(j=0;j<alpha.length;j++)
		 {
		for(k=0;k<alpha.length;k++)
		   {
		for(l=0;l<alpha.length;l++)
		    {
		for(m=0;m<alpha.length;m++)
		     {
		for(n=0;n<alpha.length;n++)
		      {

		if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n
		&& l!=m && l!=n && m!=n )
		{
		System.out.println(""+ alpha[i]+" " + alpha[j]+" "+alpha[k]+ " "+alpha[l]+ " "+alpha[m]+ " "+alpha[n]);
		count +=1;
		}
		      }
		     }
		    }
		   }
		 }
		}
		System.out.println(count);
	}
		
	}

