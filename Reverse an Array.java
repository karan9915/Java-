import java.util.*;
import java.io.*;

class Main
{
        void arrayReverse(char arr[])
	{
		char[] rev = new char[arr.length];
		int size = arr.length;
		for(int i=0;i<arr.length;i++)
		{
			rev[size - 1 - i] = arr[i];
		}

		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i] + " ");
		}
	}

       public static void main(String[] args)
       {
       char[] arr = {'a','b','c','d','e'};
       Main m = new Main();
       m.arrayReverse(arr);
       }	
}