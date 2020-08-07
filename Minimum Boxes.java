import java.util.*;
import java.io.*;

class Main
{
	void minBox(int[] arr, int n)
	{
		int box = n;
		Arrays.sort(arr);

		int l1=0, l2=1;

		while(l1<n && l2<n)
		{
			if(arr[l1]<arr[l2])
			{
				box--;
				l1++;
				l2++;
			}
			else if(arr[l1]==arr[l2])
				l2++;
		}

		System.out.println(box);
	}

	public static void main(String[] args)
	{
		int[] arr1 = {1,2,2,3,7,4,2,1};
		int[] arr2 = {1,2,3};
		int size1 = arr1.length;
		int size2 = arr2.length;

		Main m = new Main();
		m.minBox(arr1,size1);
		m.minBox(arr2,size2);
	}
}