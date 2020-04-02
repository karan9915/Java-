import java.util.*;
import java.io.*;

class Main
{
	void frequencyOfElements(int arr[])
	{
		int size = arr.length;
		int[] freq = new int[1000];
		for(int i=0;i<size;i++)
		{
			freq[arr[i]]++;
		}

		int k = 0;
		for(int i=0;i<1000;i++)
		{
		    if(freq[i]!=0)
		    {
		    	k=i;
		    	System.out.println(k + " " + freq[i]);
		    }		
		}
	}
		
	public static void main(String[] args)
	{
		int[] arr = {2,2,2,3,3,4,5,5,1,1,1,1,1};
		Main m = new Main();
		m.frequencyOfElements(arr);
    }	
}