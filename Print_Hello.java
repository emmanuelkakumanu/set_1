import java.util.*;
import java.lang.*;
import java.io.*;
class Print_Hello
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=0)
    {
      for(int i=0;i<n;i++)
      System.out.println("Hello");
		}
    else
    System.out.println("Entered Negative Number");
		

	}
}
