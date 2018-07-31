import java.util.*;
import java.lang.*;
import java.io.*;
class Even_Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=0)
		{
			if(n%2==0)
			System.out.println("Even");
			else
			System.out.println("Odd");
		}
		else
		System.out.println("Invalid");

	}
}
