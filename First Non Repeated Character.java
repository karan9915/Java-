import java.util.*;
import java.io.*;

class Main
{
	char firstNonRepeatedCharacter(String str)
	{
		char[] y = str.toCharArray();
		int size = y.length;
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<size;i++)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i],1);
			}
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i],newval);
			}
		}

			Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
			for(Map.Entry<Character,Integer> data : hmap)
			{
				if(data.getValue()==1)
				{
					return data.getKey();
				}
			}
			return '0';
		}

	public static void main(String[] args)
	{
	   String str = "aaabccdeefff";
	   Main m = new Main();
	   System.out.println(m.firstNonRepeatedCharacter(str));
       }	
}