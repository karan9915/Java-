import java.util.*;
import java.io.*;

class Main
{
	boolean isPalindromeString(String str)
	{
		int size = str.length();
		for(int i=0;i<size;i++)
		{
			if(str.charAt(i)==str.charAt(size-i-1))
			{
				return true;
			}
			else
			{
				break;
			}
		}
		return false;

	}
	public static void main(String[] args)
	{
		String str = "abcdcba";
		Main m = new Main();
		if(m.isPalindromeString(str))
			System.out.println("Is Palindrome");
		else
			System.out.println("Not a Palindrom");
       }	
}