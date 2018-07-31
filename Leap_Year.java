import java.util.*;
import java.lang.*;
import java.io.*;
class Leap_Year
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		if(y>0)
		{
			if(y%4==0)
			System.out.println("yes");
			else 
			System.out.println("no");
		}
		else 
		System.out.println("Invalid Year");
		
		

	}
}
