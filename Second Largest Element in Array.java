import java.util.*;
import java.io.*;

class Main
{
	void secondLargestElement(int arr[])
	{
		int max = 0;
		int second_largest = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				second_largest = max;
				max = arr[i];
			}

			else if(arr[i]>second_largest && arr[i]!=max)
			{
				second_largest = arr[i];
			}
		}
		System.out.println(second_largest);
	}

	public static void main(String[] args)
	{
       int[] arr = {7,2,3,9,5,8};
       Main m = new Main();
       m.secondLargestElement(arr);
      
    }	
}