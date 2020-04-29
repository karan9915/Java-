import java.util.*;
import java.io.*;

class Main
{
	static void missingElement(int arr[])
	{
		int size = arr.length;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<size;i++)
		{
			set.add(arr[i]);
		}

		int count = 0;
		for(int i=0;i<size;i++)
		{
			
			if(set.contains(count)==false)
			{
				System.out.println(count);
			}
			count++;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {9,6,4,2,3,5,7,0,1};
		missingElement(arr);
		 
       }

}