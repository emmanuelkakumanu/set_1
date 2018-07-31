import java.util.*;
import java.lang.*;
import java.io.*;
class Char_Check
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(Character.isLetter(c))
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("Vowel");
			else
			System.out.println("Consonant");
		}
		else
		System.out.println("Invalid");
		

	}
}
