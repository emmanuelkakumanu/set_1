import java.util.*;
import java.lang.*;
import java.io.*;
class Sum_K_Int
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=a[i];
		}
		
		System.out.println(sum);
		
		

	}
}
