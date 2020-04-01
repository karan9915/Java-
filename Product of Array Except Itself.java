import java.util.*;
import java.io.*;

class Main
{
	void productOfArrayExceptSelf(int arr[])
	{
		int size = arr.length;
		int[] x = new int[size];
		int[] y = new int[size];
		int[] product = new int[size];
		x[0] = 1;
		y[size-1] = 1;

		for(int i=1;i<size;i++)
		{
			x[i] = arr[i-1] * x[i-1];
		}

		for(int i=size-2;i>=0;i--)
		{
			y[i] = arr[i+1] * y[i+1];
		}

		for(int i=0;i<size;i++)
		{
			product[i] = x[i]*y[i];
		}

		for(int i=0;i<size;i++)
		{
			System.out.print(product[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {10,3,5,6,2};
		Main m = new Main();
		m.productOfArrayExceptSelf(arr);
    }	
}