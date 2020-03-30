import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
       String str = "110001010101";
       char[] bit = str.toCharArray();
       int size = bit.length;
       char[] x = new char[size];
       int left = 0;
       int right = size-1;
       for(int i=size-1;i>=0;i--)
       {
       	    if(bit[i]=='1')
       	    {
       		    x[left] = bit[i]; 
       		    left++;
        	}
        	if(bit[i]=='0')
        	{
       		    x[right] = bit[i];
       		    right--;
        	}
       }

       for(int i=0;i<size;i++)
       {
        	System.out.print(x[i]);
       }
    }	
}