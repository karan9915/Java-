import java.util.*;
import java.io.*;

class Main
{
	
	static void sortByFreq(int arr[])
	{
		int size = arr.length;
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i=0;i<size;i++)
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

		Map<Integer,Integer> revMap = new TreeMap<>();
		Set<Map.Entry<Integer,Integer>> hmap = map.entrySet();
		for(Map.Entry<Integer,Integer> data : hmap)
		{
			revMap.put(data.getValue(),data.getKey());
		}

		for(Map.Entry<Integer,Integer> data : hmap)
		{
			int mark = data.getKey();
			int k=0;
			while(k!=mark)
			{
				System.out.print(data.getValue() + " ");
				k++;
			}
		}
	}
	public static void main(String[] args)
	{
		String s = "1 1 1 1 2 2 2 3 3 4 5 5 5 5 5";
		String[] x = s.split(" ");
		int size = x.length;
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = Integer.parseInt(x[i]);
		}

		sortByFreq(arr);
    }

}