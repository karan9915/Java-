import java.util.*;
import java.io.*;

class Main
{
	void frequencyOfElements(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i],1);
			}
			else
			{
				int oldval = map.get(arr[i]);
				int newval = oldval + 1;
				map.put(arr[i],newval);
			}
		}

		Set<Map.Entry<Integer,Integer>> hmap = map.entrySet();
		for(Map.Entry<Integer,Integer> data : hmap)
		{
			System.out.println(data.getKey() + " " + data.getValue());
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {2,2,2,3,3,4,5,5,1,1,1,1,1};
		Main m = new Main();
		m.frequencyOfElements(arr);
    }	
}