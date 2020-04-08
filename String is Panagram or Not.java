import java.util.*;
import java.io.*;

class Main
{
	boolean isPanagram(String str)
	{
		str = str.replace(" ","");
		char[] y = str.toCharArray();
		int size = y.length;
		int[] a = new int[26];

		for(int i=0;i<size;i++)
		{
			int index = y[i] - 65;
			a[index] = 1; 
		}

		for(int i=0;i<a.length;)
		{
			if(a[i]==1)
			{
				i++;
			}
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
	 String s = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
	 Main m = new Main();
	 if(m.isPanagram(s))
	 	System.out.println("IS PANAGRAM");
	 else
	 	System.out.println("NOT A PANAGRAM");
    }	
}