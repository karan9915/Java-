import java.util.*;
import java.io.*;

class Main
{
	int minDistance(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<>();
		int dis = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i],1);
			}
			else
			{
				int currIndex = i;
				int prevIndex = map.get(arr[i]);
				dis = Math.min((currIndex - prevIndex),dis);
			}
		}

		if(dis == Integer.MAX_VALUE)
			return -1;
		else
			return dis;
	}

	public static void main(String[] args)
	{
		int[] arr = {3,5,4,6,5,3};
		Main m = new Main();
		System.out.println(m.minDistance(arr));
    }	
}