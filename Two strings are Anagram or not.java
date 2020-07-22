import java.util.*;
import java.io.*;

class Main
{
	static boolean isAnagram(String str1, String str2)
	{
		char[] y1 = str1.toCharArray();
		char[] y2 = str2.toCharArray();
		int size1 = y1.length;
		int size2 = y2.length;

		Arrays.sort(y1);
		Arrays.sort(y2);

		if(size1!=size2)
			return false;

		for(int i=0;i<size1;i++)
		{
			if(y1[i]!=y2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		String str1 = "listen";
		String str2 = "silent";
		if(isAnagram(str1,str2))
			System.out.println("The two strings are Anagram");
		else
			System.out.println("The two strings are not Anagram");

	}
}