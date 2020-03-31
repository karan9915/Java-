import java.util.*;
import java.io.*;

class Main
{
	void largestElement(int arr[])
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args)
	{
        int[] arr = {7,2,3,9,5,8};
        Main m = new Main();
        m.largestElement(arr);  
    }	
}