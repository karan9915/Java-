import java.util.*;
import java.io.*;

class Main
{
	void reverse(String str)
	{
		char[] y = str.toCharArray();
		int left = 0;
		int right = y.length-1;
		int size = y.length;
		while(left<right)
		{
			if(!Character.isAlphabetic(y[left]))
				left++;
			else if(!Character.isAlphabetic(y[right]))
				right--;
			else
			{
				char temp = y[left];
				y[left] = y[right];
				y[right] = temp;
				left++;
				right--;
			}
		}

		for(int i=0;i<size;i++)
		{
			System.out.print(y[i]);
		}
	}
	

	public static void main(String[] args)
	{
	   String str = "ab%cbd#&f*hji^";
	   Main m = new Main();
	   m.reverse(str);
    }	
}