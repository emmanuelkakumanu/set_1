import java.util.*;
import java.lang.*;
import java.io.*;
class Check_Alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(Character.isLetter(c))
		System.out.println("Alphabet");
		else
		System.out.println("No");
		

	}
}
