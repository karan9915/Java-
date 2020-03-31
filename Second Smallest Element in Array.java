import java.util.*;
import java.io.*;

class Main
{
	void secondSmallestElement(int arr[])
	{
		int min = arr[0];
		int second_smallest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				second_smallest = min;
				min = arr[i];
			}

			else if(arr[i]<second_smallest && arr[i]!=min)
			{
				second_smallest = arr[i];
			}
		}
		System.out.println(second_smallest);
	}

	public static void main(String[] args)
	{
       int[] arr = {7,2,3,9,5,8};
       Main m = new Main();
       m.secondSmallestElement(arr);
      
    }	
}