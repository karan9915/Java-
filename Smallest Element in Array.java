import java.util.*;
import java.io.*;

class Main
{
	void smallestElement(int arr[])
	{
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args)
	{
             int[] arr = {7,2,3,9,5,8};
             Main m = new Main();
             m.smallestElement(arr);
      
    }	
}
