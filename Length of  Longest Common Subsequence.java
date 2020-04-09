import java.util.*;
import java.io.*;

class Main
{
	int lcs(char str1[], char str2[],int s1, int s2)
	{
		if(s1==0 || s2==0)
			return 0;
		else if(str1[s1-1] == str2[s2-1])
		{
			return 1 + lcs(str1,str2,s1-1,s2-1);
		}
		else
			return max(lcs(str1,str2,s1,s2-1) , lcs(str1,str2,s1-1,s2));
	}

	int max(int a,int b)
	{
	if(a>b)
		return a;
	else
		return b;
	}

	public static void main(String[] args)
	{
		String str1 = "abcefgi";
		String str2 = "acdefjk";

		Main m = new Main();

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		int s1 = a.length;
		int s2 = b.length;

		System.out.println("Length of LCS is" + " " + m.lcs(a,b,s1,s2));
    }	
}